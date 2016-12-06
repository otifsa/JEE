package Login;



import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.User;
import Connexion.Connexion;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username+"  "+password);
		Statement st;
		ResultSet rs;
		String sql = "select * from users where username='"+username+"'and password='"+password+"'";
	    try {
	    Connection cnx=Connexion.getCnx();
		st = cnx.createStatement();
		User u=new User();
		rs = st.executeQuery(sql);

		
		 if(rs.next()==false){  
			    String out="Sorry UserName or Password Error!"; 
			    req.setAttribute("erreur", out);
		        RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
		        rd.forward(req, res);
		          
		    }  
		    else{  
		    	//rs.next();
		    	u.setId_user(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setType(rs.getInt(4));
				int type=u.getType();
				HttpSession session = req.getSession();
				session.setAttribute("user", u);
				if(type==1){
						RequestDispatcher rd=req.getRequestDispatcher("admin.jsp");
						rd.forward(req, res);
						   }
				else{
						RequestDispatcher rd=req.getRequestDispatcher("User.jsp");
						rd.forward(req, res);
					}
				
		        }  
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
