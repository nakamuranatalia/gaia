package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecycledMaterial;
import br.com.gaia.service.RecycledMaterialService;

public class AddressCommand implements Command{

	private List<RecycledMaterial> recycledMaterialList = new ArrayList<>();
	private RecycledMaterialService service = new RecycledMaterialService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		recycledMaterialList = service.readAll();
		request.setAttribute("allRecycledMaterials", recycledMaterialList);
		request.getRequestDispatcher("view/jsp/map/address.jsp").forward(request, response);
	}

}
