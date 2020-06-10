<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Imports -->
<jsp:include page="../common/imports.jsp" />
</head>
<body id="page-top" class="bg-forms">
	<!-- Menu -->
	<jsp:include page="../common/menu.jsp" />
	<!-- Page -->
	<div
		class="container h-100 margin-t-93 padding-t-55  animate__animated animate__fadeIn">
		<div class="wrapper">
			<div
				class="row h-100 align-items-center justify-content-center text-center">
				<div class="col-8">
					<h1 class="text-uppercase color_dark font-weight-bold">Your
						request was successfull</h1>
					<hr class="divider border_light my-4" />
				</div>
				<div class="col-4">
					<img class="ghost" src="../../assets/img/icones/ghost-feliz.png">
				</div>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<jsp:include page="../common/footer.jsp" />
</body>
</html>