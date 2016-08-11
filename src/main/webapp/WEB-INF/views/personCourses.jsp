<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page session="false" %>
<html>
<head>
	<title>Person Courses</title>
</head>
<body>


  <form:form method="POST" action="addPersonCourses" commandName="sample">
		<table>
			
			<tr>
				<td>Choose the courses you like:</td>
				<td>
				 <c:forEach items="${courses}" var="course">
				    <c:forEach items="${sample.userCourses}" var="userCourse">
				    <c:if test="${userCourse.id == course.id}">
				     <c:set var="id" value="${userCourse.id}"></c:set>
				       <form:checkbox path="userCourses" value="${course.id }" checked="checked"/>${course.name}<br>
				    </c:if>				    
                    </c:forEach> 
                    <c:if test="${course.id  ne id}">
                       <form:checkbox path="userCourses" value="${course.id }" checked=""/>${course.name}<br>
                    </c:if>
                 </c:forEach>
                 
                           
				<%-- <form:checkboxes  path="userCourses" items="${courses}" /> --%>
				 
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
			<tr>
		</table>
	</form:form>

 <%-- <h2>All courses are shown below:</h2>
	<br>
	<c:forEach var="course" items="${courses}">  
			<c:out value="${course.name}"/><br>
	</c:forEach>
	
    <h2>The courses you selected are shown below:</h2>
	<br>
	<c:forEach var="course" items="${sample.userCourses}">  
			<c:out value="${course.name}"/><br>
	</c:forEach> --%>
	
</body>
</html>
