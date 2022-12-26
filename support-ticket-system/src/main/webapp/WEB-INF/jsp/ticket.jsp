<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"></jsp:include>

<html lang="en">
		<div class="container">
		    <form:form action="${formAction}" method="POST" modelAttribute="ticket">
		      <fieldset>
		        <legend>${pageTitle}:</legend>
		        <br/>
		         <c:if test="${not empty ticketId}">
				    <form:input type="hidden" path="ticketId"/>
			        <form:label path="ticketId">Ticket Id:</form:label>
			        <form:input type="text" path="ticketId"/><br>
				</c:if>       	       
		        <form:label path="description">Description:</form:label>
		        <form:input type="text" path="description"/><br>
		        <form:label path="status">Ticket Status:</form:label>
		        <form:select path="status">
		            <form:option value="Open">Open</form:option>
		            <form:option value="Closed">Closed</form:option>
		        </form:select><br>
		        <input type="submit" value="${pageTitle}">
		      </fieldset>
		    </form:form>
		</div>
	</body>
</html>