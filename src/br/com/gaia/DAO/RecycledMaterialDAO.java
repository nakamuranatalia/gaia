package br.com.gaia.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.gaia.model.RecycledMaterial;

public class RecycledMaterialDAO {

	private Connection connection = ConnectionFactory.getConnection();

	public boolean create(RecycledMaterial recycledMaterial) {

		String create = "INSERT INTO recycled_material " + " (recycled_identifier_id, recycled_name) "
				+ " VALUES (?, ?) ";

		try (PreparedStatement pst = connection.prepareStatement(create)) {

			pst.setInt(1, recycledMaterial.getIdentifierCd());
			pst.setString(2, recycledMaterial.getName());

			pst.execute();

		} catch (SQLException ex) {

			System.err.println("Error in the table recycled_material");
			ex.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean update(RecycledMaterial recycledMaterial) {

		String update = "UPDATE recycled_material " + "SET recycled_name = ?" + " WHERE recycled_identifier_id = ? ";

		try (PreparedStatement pst = connection.prepareStatement(update)) {

			pst.setString(1, recycledMaterial.getName());
			pst.setInt(2, recycledMaterial.getIdentifierCd());

			pst.execute();

		} catch (SQLException ex) {

			System.err.println("Error in the table recycled_material");
			ex.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean delete(int identifier_id) {

		String delete = "DELETE FROM recycled_material " + " WHERE recycled_identifier_id = ? ";

		try (PreparedStatement pst = connection.prepareStatement(delete)) {

			pst.setInt(1, identifier_id);

			pst.execute();

		} catch (SQLException ex) {

			System.err.println("Error in the table recycled_material");
			ex.printStackTrace();

			return false;
		}

		return true;
	}

	public RecycledMaterial read(String name) {

		String read = "SELECT * FROM recycled_material " + " WHERE recycled_name = ? ";

		try (PreparedStatement pst = connection.prepareStatement(read)) {

			pst.setString(1, name);
			ResultSet result = pst.executeQuery();

			RecycledMaterial recycledMaterial = new RecycledMaterial();
			if (result.next()) {
				recycledMaterial.setIdentifierCd(result.getInt("recycled_identifier_id"));
				recycledMaterial.setName(name);
			}
			return recycledMaterial;

		} catch (SQLException ex) {

			System.err.println("Error in the table recycled_material");
			ex.printStackTrace();

			return null;
		}

	}

	public ArrayList<RecycledMaterial> readAll() {
		ArrayList<RecycledMaterial> recycledMaterialArray = new ArrayList<>();
		String read = "SELECT recycled_material_name FROM gaia.recycled_material";

		try (PreparedStatement pst = connection.prepareStatement(read)) {
			ResultSet result = pst.executeQuery();
			while (result.next()) {
				RecycledMaterial recycledMaterial = new RecycledMaterial();
				recycledMaterial.setName(result.getString("recycled_material_name"));
				recycledMaterialArray.add(recycledMaterial);
			}

			return recycledMaterialArray;

		} catch (SQLException ex) {
			System.err.println("Error in the table recycled_material");
			ex.printStackTrace();
			return null;
		}

	}

}