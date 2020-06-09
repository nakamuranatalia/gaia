package br.com.gaia.service;

import java.util.List;

import br.com.gaia.DAO.RecycledMaterialDAO;
import br.com.gaia.model.RecycledMaterial;

public class RecycledMaterialService {
	
	public RecycledMaterialDAO dao = new RecycledMaterialDAO();
	
	public boolean create(RecycledMaterial recycled) {
		if(recycled.getIdentifierCd()==0) {
			return false;
		}else {
			return dao.create(recycled);
		}
	}
	
	public boolean delete(int recycled_identifier_cd) {
		return dao.delete(recycled_identifier_cd);
	}
	
	public boolean update(RecycledMaterial recycled) {
		return dao.update(recycled);
	}
	
	public RecycledMaterial read(String name) {
		return dao.read(name);
	}
	
	public List<RecycledMaterial> readAll(){
		return dao.readAll();
	}
	

}

