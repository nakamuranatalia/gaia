package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecyclingIdeas;
import br.com.gaia.service.RecyclingIdeasService;

public class ReadMetalIdeasCommand implements Command{

	private RecyclingIdeasService service = new RecyclingIdeasService();
	private List<RecyclingIdeas> recyclingIdeasList = new ArrayList<>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		recyclingIdeasList = service.read("metal");
		request.setAttribute("metalList", recyclingIdeasList);
		request.getRequestDispatcher("view/jsp/recycling-ideas/recycling-ideas-list-metal.jsp").forward(request, response);
	}
}
