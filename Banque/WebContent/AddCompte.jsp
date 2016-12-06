<%@ page language="java" contentType="text/html; charset=ISO-8859-15"
    pageEncoding="ISO-8859-15"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
<title>Insert title here</title>
</head>
<body>

<div class="row" >
<div class="col-sm-5">

<form action="AddCompte" method="post" >


		<div class="form-group">
		<label for="nom">Libelle: </label>
		<input type="text" name="libelle" /><br>
		</div>
		
		<div class="form-group">
		<label for="Prenom">solde: </label>
		<input type="text" name="solde" /><br>
		</div>
		
		<div class="form-group">
		<label for="Prenom">date de ceation: </label>
		<input type="text" name="date" /><br>
		</div>
		
		 <input type="submit" value="ajouter"/>
		
</form>
</div>
</div>

</body>
</html>