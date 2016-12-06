package Login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Compte;
import Beans.User;
import Connexion.Connexion;

/**
 * Servlet implementation class Consult
 */
@WebServlet("/Consult")
public class Consult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		User u=new User();
        HttpSession session = req.getSession();
		u=(User) session.getAttribute("user");
		Connection cnx;
		try {
			cnx = Connexion.getCnx();
			java.sql.Statement st=cnx.createStatement();
			String sql="select id_compte,solde from comptes where id_client="+u.getId_user();
			ResultSet rs=st.executeQuery(sql);
			rs.next();
			int id_compte=rs.getInt(1);
			double solde=rs.getDouble(2);
			System.out.println(id_compte);
			Compte c=new Compte(id_compte,null,null,solde,null);
			session.setAttribute("compte", c);
			req.getRequestDispatcher("Consult.jsp").forward(req,res);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
