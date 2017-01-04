<%@page import="metier.Produit"%>
<%@page import="fsa.ac.ma.ProduitBeans"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GestionProduits</title>
</head>
<body>
<h3>Tutorial JEE( JSP Servlet MVC et JDBC)</h3>
<h2>Ajouter un nouveau Produit</h2>
<form action="ProduitServlet" method="post">
<table border="1" width="30%">
<tr>
<td>Nom </td>
<td><input type="text" name="nom"/> </td>
</tr>
<tr>
<td>Description </td>
<td><input type="text" name="desc"/></td>
</tr><tr>
<td>Prix </td>
<td><input type="text" name="prix"/> </td>

</tr><tr>
<td>Etat</td>
<td><input type="text" name="etat"/> </td>
</tr><tr>
<td colspan="2"><input type="submit" value="valider"/> </td>
<td> </td>
</tr>
</table>
</form>

<%ProduitBeans produits;
if(request.getAttribute("modele")!=null){
produits=(ProduitBeans)request.getAttribute("modele");}
else
{ produits=new ProduitBeans();}
%>
<% Iterator <Produit> list=produits.getList().iterator();
while(list.hasNext())
{
Produit p=list.next();%>
<table border="1" width="60%">
<tr>
<td> <%= p.getId()%></td>
<td> <%= p.getNom()%></td>
<td> <%= p.getDesc()%></td>
<td> <%= p.getPrix()%></td>
<td> <%= p.getEtat()%></td>
<td>
<form action="ProduitServlet" method="get">
<input type="hidden" name="id" value="<%= p.getId()%>"/>
<input type="hidden" name="action" value="supprimer"/>
<input type="submit" value="supprimer"/>
</form>
</td>
</tr>
<%} %>
</table>
</body>
</html>