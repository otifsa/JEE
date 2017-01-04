<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="log" method="post">
<s:submit value="OK"></s:submit>
</s:form>
<s:iterator status="stat" value="list">
<s:property value="nom"/>     <s:property value="age"/>  

</s:iterator>
</body>
</html>