package metier;
import java.sql.*;
import java.util.ArrayList;
		public class services {
			private ArrayList<Produit> produit=new ArrayList<Produit>();

			public void add(Produit p)
			{
				try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection)
			DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			PreparedStatement pr= (PreparedStatement) cn.prepareStatement("INSERT INTO produits(`nom`, `desc`, `prix`, `etat`) VALUE (?,?,?,?)");
			pr.setString(1, p.getNom());
			pr.setString(2, p.getDesc());
			pr.setInt(3, p.getPrix());
			pr.setInt(4, p.getEtat());
			pr.execute();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			produit.add(p);
			}
			public void remove (Long id)
			{try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection)
			DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			PreparedStatement pr= (PreparedStatement) cn.prepareStatement("DELETE FROM produits where id = ?");
			pr.setLong(1, id);
			pr.execute();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			for(Produit p:produit)
			{if (p.getId()==id){produit.remove(p); break;}
			} }
			public Produit getProduitDetails(Long id)
			{ for(Produit p:produit)
			
			if (p.getId()==id) {return p;}
			return null;
			}
			public ArrayList<Produit> getAll(){
			ArrayList<Produit> listproduit=new ArrayList<Produit>();
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection)
			DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			PreparedStatement pr= (PreparedStatement) cn.prepareStatement("SELECT * FROM produits");
			ResultSet rs= pr.executeQuery();
			while(rs.next()){
			Produit p=new Produit();
			p.setId(rs.getLong("id"));
			p.setNom(rs.getString("nom"));
			p.setDesc(rs.getString("desc"));
			p.setPrix(rs.getInt("prix"));
			p.setEtat(rs.getInt("etat"));
			listproduit.add(p);
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			return listproduit;}
			}
		