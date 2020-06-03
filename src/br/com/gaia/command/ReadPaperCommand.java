package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecyclingIdeas;
import br.com.gaia.service.RecyclingIdeasService;

public class ReadPaperCommand implements Command{

	private RecyclingIdeasService service = new RecyclingIdeasService();
	private List<RecyclingIdeas> list = new ArrayList<>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		list = service.read("paper");
		request.setAttribute("paperList", list);
		request.getRequestDispatcher("view/jsp/recycling-ideas/recycling-ideas-list-paper.jsp").forward(request, response);
	}
}
