package ajax_interaction;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxHandler extends HttpServlet implements Servlet{
	
	//Constructeur
	public AjaxHandler(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String resultat = "invalide";
		String valeur = request.getParameter("valeur");
	 
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");
	 
		if ((valeur != null) && valeur.startsWith("X")) {
				resultat = "valide";
		}
	 
		response.getWriter().write("<message>"+resultat+"</message>");
	}
}
