package br.com.gaia.service;

import java.util.List;

import br.com.gaia.DAO.RecyclingIdeasDAO;
import br.com.gaia.model.RecyclingIdeas;

public class RecyclingIdeasService {
	
	public RecyclingIdeasDAO dao = new RecyclingIdeasDAO();
	
	public boolean create(RecyclingIdeas recipe) {
		if(recipe.getIdentifierCd()==0) {
			return false;
		}
		return dao.create(recipe);
	}
	
	public boolean delete(int identifier_cd) {
		if(identifier_cd==0) {
			return false;
		}
		return dao.delete(identifier_cd);
	}
	
	public List<RecyclingIdeas> read(String material) {
		return dao.read(material);
	}
	
	public boolean update (RecyclingIdeas recyclingIdeas) {
		return dao.update(recyclingIdeas);
	}
	
	public RecyclingIdeas readOne(String title) {
		return dao.readOne(title);
	}

}