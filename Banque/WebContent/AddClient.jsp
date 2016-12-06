<%@ page language="java" contentType="text/html; charset=ISO-8859-15"
    pageEncoding="ISO-8859-15"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css"/>
<title>Insert title here</title>
</head>
<body>
<div class="row" >
<div class="col-sm-5">

<form action="AddClient" method="post" >


		<div class="form-group">
		<label for="nom">Nom: </label>
		<input type="text" name="nom" /><br>
		</div>
		
		<div class="form-group">
		<label for="Prenom">Prenom: </label>
		<input type="text" name="prenom" /><br>
		</div>
		
		<div class="form-group">
		<label for="nom">Adresse: </label>
		<input type="text" name="adresse" /><br>
		</div>
		
		 <input type="submit" value="ajouter"/>
		
</form>

</div>
</div>

</body>
</html>