package Login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Client;
import Beans.Compte;
import Beans.User;
import Connexion.Connexion;

/**
 * Servlet implementation class AddCompte
 */
@WebServlet("/AddCompte")
public class AddCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCompte() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String libelle=req.getParameter("libelle");
        Double solde=Double.parseDouble(req.getParameter("solde"));
        String date=req.getParameter("date");
        User u=new User();
        HttpSession session = req.getSession();
		u=(User) session.getAttribute("user");
		u.show();
		Client cl=new Client(u.getId_user(),u.getUsername(),u.getUsername(),"agadir");
        Compte c=new Compte(libelle,date,solde,cl);
        Connection cnx = null;
		PreparedStatement ps;
		
		try {
			cnx=Connexion.getCnx();
			int nb=(int) (Math.random()*1000);
			ps=cnx.prepareStatement("insert into comptes values(?,?,?,?,?)");
			ps.setInt(1, nb);
			ps.setString(2, c.getLibelle_compte());
			ps.setString(3,c.getDate_de_creation());
			ps.setDouble(4, c.getSolde());
			ps.setInt(5, c.getClient().getId_client());
			
			ps.execute();
			
		    res.sendRedirect("User.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	
	}

}
