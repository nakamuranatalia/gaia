package br.com.gaia.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.Gaia;
import br.com.gaia.service.GaiaService;

public class MapCommand implements Command{

	private GaiaService service = new GaiaService();
	private List<Gaia> gaiaList = new ArrayList<>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = request.getParameter("address");
		String neighborhood = request.getParameter("neighborhood");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String cep = request.getParameter("cep");
		String fullAddress = address + " " + neighborhood + " " + city + " " + state + " " + cep;

		gaiaList = service.getGaia(fullAddress, "Reciclagem");
		
		request.setAttribute("addressList", gaiaList);
		request.getRequestDispatcher("view/jsp/map/map.jsp").forward(request, response);
		
	}


}
