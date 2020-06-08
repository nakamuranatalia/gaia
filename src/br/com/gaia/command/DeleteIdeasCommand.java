package br.com.gaia.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.service.RecyclingIdeasService;

public class DeleteIdeasCommand implements Command{

	private RecyclingIdeasService service = new RecyclingIdeasService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int identifierCd = Integer.parseInt(request.getParameter("code"));

		if(service.delete(identifierCd)==true) {
			response.sendRedirect("view/jsp/error-messages/success.jsp");
		}else {
			response.sendRedirect("view/jsp/error-messages/error.jsp");
		}
		
	}

}
