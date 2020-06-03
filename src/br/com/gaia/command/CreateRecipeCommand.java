package br.com.gaia.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecycledMaterial;
import br.com.gaia.model.RecyclingIdeas;
import br.com.gaia.service.RecyclingIdeasService;

public class CreateRecipeCommand implements Command{

	private RecyclingIdeasService service = new RecyclingIdeasService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cd = Integer.parseInt(request.getParameter("code"));
		String title = request.getParameter("title");
		String material = request.getParameter("material");
		String materials = request.getParameter("ingredients");
		String step = request.getParameter("step");
		
		RecycledMaterial recycledMaterial = new RecycledMaterial(material);
		RecyclingIdeas recipe = new RecyclingIdeas(cd, title, recycledMaterial, materials, step);
		
		if(service.create(recipe)==true) {
			response.sendRedirect("view/jsp/error-messages/success.jsp");
		}else {
			response.sendRedirect("view/jsp/error-messages/error.jsp");
		}
		
	}

}
