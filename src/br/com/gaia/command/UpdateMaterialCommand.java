package br.com.gaia.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecycledMaterial;
import br.com.gaia.service.RecycledMaterialService;

public class UpdateMaterialCommand implements Command{

	private RecycledMaterialService service = new RecycledMaterialService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int identifierCd = Integer.parseInt(request.getParameter("code"));
		String name = request.getParameter("name");
		
		RecycledMaterial recycled = new RecycledMaterial(identifierCd, name);
		
		if(service.update(recycled)==true) {
			response.sendRedirect("view/jsp/error-messages/success.jsp");
		}else {
			response.sendRedirect("view/jsp/error-messages/error.jsp");
		}
		
	}
	
}
