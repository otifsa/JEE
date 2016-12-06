<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html > 
<head>
	
	<title>Login</title>
	<link rel="stylesheet" href="css/bootstrap.css"/>
	<link rel="stylesheet" href="css/style.css"/>
</head> 
<body> 
	<form action="Login" method="post">
  <div>Login</div>
  <label>Username <span>*</span></label>
  <input type="text" name="username"/>
  <div class="help">At least 6 character</div>
  <label>Password <span>*</span></label>
  <input type="text" name="password"/>
  <div class="help">Use upper and lowercase lettes as well</div>
  <button>Login</button>
  <%Object msg=new Object(); %>
  

  <%
if(request.getAttribute("erreur")!=null){
	msg=request.getAttribute("erreur");%>
	 <div class="alert alert-danger col-centered">
	<%= msg.toString() %>
	 </div>
<%} %>

 
</form>
    
</body> 
</html>