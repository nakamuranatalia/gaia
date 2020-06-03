package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecyclingIdeas;
import br.com.gaia.service.RecyclingIdeasService;

public class ReadPlasticIdeasCommand implements Command{

	private RecyclingIdeasService service = new RecyclingIdeasService();
	private List<RecyclingIdeas> recyclingIdeasList = new ArrayList<>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		recyclingIdeasList = service.read("plastic");
		request.setAttribute("plasticList", recyclingIdeasList);
		request.getRequestDispatcher("view/jsp/recycling-ideas/recycling-ideas-list-plastic.jsp").forward(request, response);
	}
}