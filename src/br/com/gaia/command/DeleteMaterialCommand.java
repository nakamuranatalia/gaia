package br.com.gaia.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.service.RecycledMaterialService;

public class DeleteMaterialCommand implements Command{
	
	private RecycledMaterialService service = new RecycledMaterialService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int recycledIdentifierCd = Integer.parseInt(request.getParameter("code"));
		
		if(service.delete(recycledIdentifierCd)==true) {
			response.sendRedirect("view/jsp/error-messages/success.jsp");
		}else {
			response.sendRedirect("view/jsp/error-messages/error.jsp");
		}
		
	}

}
