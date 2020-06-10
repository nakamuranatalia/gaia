<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- Imports -->
	<jsp:include page="../common/imports.jsp" />
</head>
<body id="page-top">
	<!-- Menu-->
	<jsp:include page="../common/menu.jsp" />
	<!-- Page -->
	<section
		class="margin-t-93 padding-t-55 animate__animated animate__fadeIn">
		<div class="wrapper">
			<div class="container">
				<c:forEach items="${plasticList}" var="ideas">
					<div class="row justify-content-center">
						<div class="col-lg-12 text-center">
							<h3 class="text-uppercase font_black font-weight-bold">${ideas.title}</h3>
							<hr class="divider border_light my-4" />
						</div>
					</div>
					<div class="row col-12 text-center">
						<div class="col-6">
							<h3 class="text-uppercase font_black font-weight-bold">Materials:</h3>
						</div>
						<div class="col-6">
							<h3 class="text-uppercase font_black font-weight-bold">Step
								by step:</h3>
						</div>
					</div>
					<div class="row">
						<div class="col-4 offset-2">
							<%
								pageContext.setAttribute("newLineChar", "\n");
							%>
							<p>${fn:replace(ideas.materials,newLineChar,"<br/>")}</p>
						</div>
						<div class="col-4 offset-1">
							<p>${fn:replace(ideas.steps,newLineChar,"<br/>")}</p>
							<br>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- Footer-->
	<jsp:include page="../common/footer.jsp" />
</body>
</html>