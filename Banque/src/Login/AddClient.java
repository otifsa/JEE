package Login;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

import Beans.Client;
import Connexion.Connexion;

/**
 * Servlet implementation class AddClient
 */
@WebServlet("/AddClient")
public class AddClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nom=req.getParameter("nom");
		String prenom=req.getParameter("prenom");
		String adresse=req.getParameter("adresse");
		Connection cnx = null;
		PreparedStatement ps;
		Client c=new Client(nom,prenom,adresse);
		try {
			cnx=Connexion.getCnx();
			int nb=(int) (Math.random()*1000);
			ps=cnx.prepareStatement("insert into clients values(?,?,?,?)");
			ps.setInt(1, nb);
			ps.setString(2, c.getNom());
			ps.setString(3,c.getPrenom());
			ps.setString(4, c.getAdresse());
			ps.execute();
			
			ps=cnx.prepareStatement("insert into users values(?,?,?,?)");
			ps.setInt(1,nb);
			ps.setString(2, c.getNom());
			ps.setString(3,c.getPrenom());
			ps.setInt(4, 0);
			ps.execute();
		    res.sendRedirect("admin.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
