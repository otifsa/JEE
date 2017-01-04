package fsa.ac.ma;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Produit;
import metier.services;

/**
 * Servlet implementation class ProduitServlet
 */
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private services serv;
    public void init() throws ServletException
    {
    serv=new services(); //un seul objet qui sera créé
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String desc=request.getParameter("desc");
		String prix=request.getParameter("prix");
		String etat=request.getParameter("etat");
		
		ProduitBeans prodBeans= new ProduitBeans();
		
		serv.add(new Produit(1L,nom,desc,Integer.parseInt(prix),Integer.parseInt(etat)));
		prodBeans.setList(serv.getAll());
		request.setAttribute("modele", prodBeans);
		request.getRequestDispatcher("Produit.jsp").forward(request,response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p_id=request.getParameter("id");
		long id=Integer.parseInt(p_id);
		serv.remove(id);
		ProduitBeans prodBeans= new ProduitBeans();
		prodBeans.setList(serv.getAll());
		request.setAttribute("modele", prodBeans);
		request.getRequestDispatcher("Produit.jsp").forward(request,response);
	}

}
