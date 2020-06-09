package br.com.gaia.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gaia.model.RecycledMaterial;
import br.com.gaia.service.RecycledMaterialService;

public class UpdateMaterialSearchCommand implements Command{

	private RecycledMaterialService service = new RecycledMaterialService();
	private RecycledMaterial material = new RecycledMaterial();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		material = service.read(name);
		
		if(material.getIdentifierCd()==0) {
			response.sendRedirect("view/jsp/error-messages/error.jsp");
		}else {
			request.setAttribute("recycledName", material.getName());
			request.setAttribute("recycledIdentiferCd", material.getIdentifierCd());
			request.getRequestDispatcher("view/jsp/recycled-material/recycled-material-update-form.jsp").forward(request, response);
		}
	}

}
