package br.com.gaia.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gaia.model.RecycledMaterial;
import br.com.gaia.model.RecyclingIdeas;

public class RecyclingIdeasDAO {
	
	private Connection connection;
	
	public RecyclingIdeasDAO() {
		this.connection = ConnectionFactory.getConnection();
	}

	public boolean create(RecyclingIdeas recyclingIdeas) {
			
		String create = "INSERT INTO  recycling_ideas (recycling_ideas_identifier_cd, recycling_ideas_title, fk_recycled_material_id, "
				+ "recycling_ideas_materials, recycling_ideas_steps) "
				+ "VALUES (?, ?,(SELECT recycled_material_id FROM recycled_material WHERE recycled_material_name= ?), ?, ?)";
		
		try ( PreparedStatement pst = connection.prepareStatement(create) ) {
			
			pst.setInt(1, recyclingIdeas.getIdentifierCd());
			pst.setString(2, recyclingIdeas.getTitle());
			pst.setString(3, recyclingIdeas.getRecycledMaterial().getName());
			pst.setString(4, recyclingIdeas.getMaterials());
			pst.setString(5, recyclingIdeas.getSteps());
			
			pst.execute();
			
		} catch (SQLException ex) {
			
			System.err.println("Error in the table recycling_ideas");
			ex.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean update(RecyclingIdeas recyclingIdeas) {
		
		String update = "UPDATE recycling_ideas SET recycling_ideas_title=?, fk_recycled_material_id= "
				+ "(SELECT recycled_material_id FROM recycled_material WHERE recycled_material_name= ?), "
				+ "recycling_ideas_materials=?, recycling_ideas_steps=? WHERE recycling_ideas_identifier_cd=?";
		
		try ( PreparedStatement pst = connection.prepareStatement(update) ) {
			
			pst.setString(1, recyclingIdeas.getTitle());
			pst.setString(2, recyclingIdeas.getRecycledMaterial().getName());
			pst.setString(3, recyclingIdeas.getMaterials());
			pst.setString(4, recyclingIdeas.getSteps());
			pst.setInt(5, recyclingIdeas.getIdentifierCd());
			
			pst.execute();
			
		} catch (SQLException ex) {
			
			System.err.println("Error in the table recycling_ideas");
			ex.printStackTrace();
			return false;
		}
		
		return true;
	}

	
	public boolean delete(int identifier_id) {
		
		String delete = "DELETE FROM recycling_ideas WHERE recycling_ideas_identifier_cd=?";
		
		try ( PreparedStatement pst = connection.prepareStatement(delete) ) {
			
			pst.setInt(1, identifier_id);
			
			pst.execute();
			
			
		} catch (SQLException ex) {
			
			System.err.println("Error in the table recycling_ideas");
			ex.printStackTrace();
			
			return false;
		}
		
		return true;
	}
	
	public List<RecyclingIdeas> read(String material) {
		
		String read = "SELECT  recycling_ideas_identifier_cd, recycling_ideas_title, recycled_material_name, recycling_ideas_materials, recycling_ideas_steps " 
				+ "FROM recycling_ideas " 
				+ "INNER JOIN recycled_material ON fk_recycled_material_id = recycled_material_id " 
				+ "WHERE recycled_material_name = ?";
		
		try ( PreparedStatement pst = connection.prepareStatement(read) ) {
			
			pst.setString(1, material);
			ResultSet result = pst.executeQuery();
			
			List<RecyclingIdeas> rArray = new ArrayList<RecyclingIdeas>();
			while (result.next()) {
				RecyclingIdeas recyclingIdeas = new RecyclingIdeas();
				RecycledMaterial recycledMaterial = new RecycledMaterial();
				
				recycledMaterial.setName(material);
		
				recyclingIdeas.setIdentifierCd(result.getInt("recycling_ideas_identifier_cd"));
				recyclingIdeas.setTitle(result.getString("recycling_ideas_title"));
				recyclingIdeas.setRecycledMaterial(recycledMaterial);
				recyclingIdeas.setMaterials(result.getString("recycling_ideas_materials"));
				recyclingIdeas.setSteps(result.getString("recycling_ideas_steps"));
				rArray.add(recyclingIdeas);
			}
			return rArray;
			
		} catch (SQLException ex) {
			
			System.err.println("Error in the table recycling_ideas.");
			ex.printStackTrace();
			
			return null;
		}
	}
	
	public RecyclingIdeas readOne(String title) {
		
		String read = "SELECT  recycling_ideas_identifier_cd, recycling_ideas_title, recycled_material_name, recycling_ideas_materials, recycling_ideas_steps " 
				+ "FROM recycling_ideas INNER JOIN recycled_material ON fk_recycled_material_id = recycled_material_id "
				+ "WHERE recycling_ideas_title =?";
	
		try ( PreparedStatement pst = connection.prepareStatement(read) ) {
		
			pst.setString(1, title);
			ResultSet result = pst.executeQuery();
		
			RecyclingIdeas recyclingIdeas = new RecyclingIdeas(); 
			if (result.next()) {
				RecycledMaterial recycledMaterial = new RecycledMaterial(result.getString("recycled_material_name"));
				
				recyclingIdeas.setIdentifierCd(result.getInt("recycling_ideas_identifier_cd"));
				recyclingIdeas.setTitle(title);
				recyclingIdeas.setRecycledMaterial(recycledMaterial);
				recyclingIdeas.setMaterials(result.getString("recycling_ideas_materials"));
				recyclingIdeas.setSteps(result.getString("recycling_ideas_steps"));
			}
			return recyclingIdeas;
		
		} catch (SQLException ex) {
		
			System.err.println("Error in the table recycled material");
			ex.printStackTrace();
		
			return null;
	}
	
	}
	
}