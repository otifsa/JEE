package Login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Beans.Compte;
import Beans.User;
import Connexion.Connexion;

/**
 * Servlet implementation class Retrait
 */
@WebServlet("/Retrait")
public class Retrait extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrait() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Double mt=Double.parseDouble(req.getParameter("montant"));
		String libelle=req.getParameter("libelle");
		User u=new User();
        HttpSession session = req.getSession();
		u=(User) session.getAttribute("user");
		try {
			int nb=(int) (Math.random()*1000);
			Connection cnx=Connexion.getCnx();
			java.sql.Statement st=cnx.createStatement();
			java.sql.Statement st1=cnx.createStatement();
			String sql="select id_compte from comptes where id_client="+u.getId_user();
			ResultSet rs=st.executeQuery(sql);
			rs.next();
			int id_compte=rs.getInt(1);
			String timeStamp = new SimpleDateFormat("yyyy/mm/dd").format(Calendar.getInstance().getTime());
			java.sql.PreparedStatement ps=cnx.prepareStatement("insert into operations values(?,?,?,?,?,?)");
			ps.setInt(1, nb);
			ps.setString(2, libelle);
			ps.setDouble(3,mt);
			ps.setString(4,timeStamp );
			ps.setInt(5, id_compte);
			ps.setString(6, "RETRAIT");
			ps.execute();
			String sql1="update comptes set solde=solde-"+mt+" where id_compte="+id_compte;
			st1.executeUpdate(sql1);
			res.sendRedirect("User.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
