package oti.fsa.moh;

import java.sql.*;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import antlr.collections.List;

public class LoginAction extends ActionSupport{
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
      private ArrayList<user> list;
      user u;
	public String execute() throws Exception{
		list=new ArrayList();
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
		Statement st=cnx.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		while (rs.next())
		{
			 u=new user(rs.getString(1),rs.getInt(2));
			u.show();
			list.add(u);
		}
			
			return "OK";

	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list =  list;
	}
	
}
