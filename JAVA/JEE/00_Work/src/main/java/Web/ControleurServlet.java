package Web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Metier.CreditMetierImpl;
import Metier.IcreditMetier;

@WebServlet(name = "cs" , urlPatterns = {"/controleur" ,"*.php"} )

public class ControleurServlet  extends HttpServlet{
	
	
	// create a interface variable 
	private IcreditMetier metier ;
	
	
	// execute 1 time (start)
	@Override
	public void init() throws ServletException {
		
		//create 1 time metier object 
		
		metier = new CreditMetierImpl();

	}
	
	
	// if web server receved get request 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		      
		     // the jpa need a data from model to work -> give it null 
		    // set the model in req object (rep = null ) -> forward into jpa (servelt end )
		
		     req.setAttribute("creditmodel", new CreditModel(0, 0, 0, 0));
             req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
		
	}
	
	// if web server receved post request 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// the post has a data -> set it into variables 
		
		double montant = Double.parseDouble(req.getParameter("montant"));
		double taux = Double.parseDouble(req.getParameter("taux"));
		int duree = Integer.parseInt(req.getParameter("duree"));
		
		// this data needs treatment -> send it to metier 
		//CreditMetierImpl metier = new CreditMetierImpl(); -> chaque fois cree une objet
		double mensualite = metier.claculerMesualiteCredit(montant, taux, duree);
		
		//data treatment return in menualite variable -> save it in model 
		CreditModel model = new CreditModel(montant, taux, duree, mensualite);
		//set the model in req object (rep null) -> forward into jpa (servlet end )
		req.setAttribute("creditmodel", model);
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
	}
}
