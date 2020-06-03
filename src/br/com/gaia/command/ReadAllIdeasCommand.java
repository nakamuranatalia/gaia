package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecyclingIdeas;
import br.com.gaia.service.RecyclingIdeasService;

public class ReadAllIdeasCommand implements Command{

	private List<RecyclingIdeas> recyclingIdeasList = new ArrayList<>();
	private RecyclingIdeasService service = new RecyclingIdeasService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String material = request.getParameter("material");
		recyclingIdeasList = service.read(material);
		
		request.setAttribute("recyclingIdeasList", recyclingIdeasList);
		request.getRequestDispatcher("view/jsp/recycling-ideas/recycling-ideas-list-all.jsp").forward(request, response);
	}

}
