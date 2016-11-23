<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap sample| Home</title>

<link href="/static/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/static/css/styles.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">School</a>
			<div clas="nav navbar-nav">
				<ul class="nav navbar-nav">
					<li><a href="new-matter">New Matter</a></li>
					<li><a href="all-matters">All Matters</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
	<c:when test="${mode=='MODE_HOME_MATTERS'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Hello Ramiro Soto</h1>
				</div>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_MATTERS'}">
			<div class="container text-center" id="taskDiv">
				<h3>My Matters</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Teacher</th>
								<th>Date Start</th>
								<th>Approved</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="matter" items="${matters}">
								<tr>
									<td>${matter.id}</td>
									<td>${matter.name}</td>
									<td>${matter.teacher}</td>
									<td><fmt:formatDate pattern="dd-MM-yyyy" value="${matter.startDate}"/></td>
									<td>${matter.approved==true?'Yes':'No'}</td>
									<td><a href="update-matter?id=${matter.id}"><span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-matter?id=${matter.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW_MATTER' || mode=='MODE_UPDATE_MATTER'}">
			<div class="container text-center">
				<h3>Matters</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-matter">
					<input type="hidden" name="id" value="${matter.id}" />
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${matter.name}" name="name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Teacher</label>
						<div class="col-md-7">
							<input type="text" class="form-control"
								value="${matter.teacher}" name="teacher" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Approved</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1"
							 name="approved" value="true"/>
							 <div class="col-sm-1">Yes</div>
							 <input type="radio" class="col-sm-1"
							 name="approved" value="false" checked="checked"/>
							 <div class="col-sm-1">No</div>
						</div>
					</div>
					<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Save" />
					</div>
				</form>

			</div>
		</c:when>
	</c:choose>
	

	<script type="text/javascript" src="/static/js/jquery.min.js">
		
	</script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js">
		
	</script>
</body>
</html>
