package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecycledMaterial;
import br.com.gaia.model.RecyclingIdeas;
import br.com.gaia.service.RecycledMaterialService;
import br.com.gaia.service.RecyclingIdeasService;

public class UpdateIdeasSearchCommand implements Command{

	private RecyclingIdeasService reyclingIdeasService = new RecyclingIdeasService();
	private RecyclingIdeas recyclingIdeas = new RecyclingIdeas();
	private List<RecycledMaterial> recycledMaterialList = new ArrayList<>();
	private RecycledMaterialService recycledMaterialService = new RecycledMaterialService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		recyclingIdeas = reyclingIdeasService.readOne(title);
		recycledMaterialList = recycledMaterialService.readAll();
		
		if(recyclingIdeas.getIdentifierCd()==0) {
			response.sendRedirect("view/jsp/error-messages/error.jsp");
		}else {
			request.setAttribute("recyclingIdeasCd", recyclingIdeas.getIdentifierCd());
			request.setAttribute("recyclingIdeasTitle", recyclingIdeas.getTitle());
			request.setAttribute("recyclingIdeasMaterial", recyclingIdeas.getRecycledMaterial().getName());
			request.setAttribute("allRecycledMaterial", recycledMaterialList);
			request.setAttribute("recyclingIdeasMaterials", recyclingIdeas.getMaterials());
			request.setAttribute("recyclingIdeasSteps", recyclingIdeas.getSteps());
			request.getRequestDispatcher("view/jsp/recycling-ideas/recycling-ideas-update-form.jsp").forward(request, response);
		}
	}
}
