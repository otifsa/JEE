package Connexion;

import java.sql.*;

public class Connexion {
	public static Connection cnx;

	public static Connection getCnx() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		cnx =DriverManager.getConnection("jdbc:mysql://localhost:3306/javabanque","root","");
		return cnx;
	}	
}
