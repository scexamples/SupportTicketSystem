<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="header.jsp"></jsp:include>

<html lang="en">

<body>
	<div class="container">	    
	    <c:if test="${not empty projectId}">
			<form class="invalidate-session" action="/invalidate" method="post">		      
		        <label>Log out of current project</label>
		        <input type="submit" value="Log out">		      
		    </form>
		</c:if>
		<c:if test="${empty projectId}">	
		    <form action="/setProject" method="post">
		      <fieldset>
		        <legend>Select a project below:</legend>
		        <label>Project name:</label><br>
		        <select id="projectId" name="projectId">
		            <option value="-">Select Project</option>
		            <option value="Project ABC">Project ABC</option>
		        </select>
		        <input type="submit" value="Submit">
		      </fieldset>
		    </form>
	    </c:if>    		
		<c:if test="${not empty error}">
		    <br/>
		    <div class="error">${error}</div>
		</c:if>	
		<c:if test="${not empty tickets}">
			<div>
				<br/>
				<h3>List Of Tickets
					<c:if test="${not empty projectId}">
					    <span>for ${projectId}</span>
					</c:if>	
				</h3>
				<table class="table table-hover">
					<thead>
					<tr>
					  <th>Ticket Id</th>
					  <th>Description</th>
					  <th>Status</th>
					  <th>Date</th>
					  <th>Actions</th>
					</tr>
					</thead>
					<c:forEach items="${tickets}" var="ticket">
					    <tr>
					        <td><c:out value="${ticket.ticketId}"/></td>
					        <td><c:out value="${ticket.description}"/></td>
					        <td><c:out value="${ticket.status}"/></td>
					        <td><fmt:formatDate value="${ticket.date}" pattern="MMM-dd-yyyy"/></td>					        
					    	<td><a href="/tickets/${ticket.ticketId}">Update</a>&nbsp;&nbsp;&nbsp;<a href="/delete/${ticket.ticketId}">Delete</a></td>
					    </tr>
					</c:forEach>
				  <tr>
				    <td colspan="5">
				       <form action="/showForm">
				          <input type="submit" value="Add New">
				       </form>
				    </td>
				  </tr>
				</table>
			</div>
		</c:if>
	</div>
</body>
</html>