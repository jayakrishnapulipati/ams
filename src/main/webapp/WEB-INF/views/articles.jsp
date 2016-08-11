<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page session="false" %>
<html>
<head>
	<title>Articles</title>
</head>
<body>


 <h2>All articles are shown below:</h2>
	<br>
	<c:forEach var="article" items="${articles}">  
			<c:out value="${article.articleName}"/><br>
	</c:forEach>
	
</body>
</html>
