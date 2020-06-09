<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<section class="margin-t-93 padding-t-55 animate__animated animate__fadeIn">
		<div class="wrapper">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-10 text-center">
						<h3 class="text-uppercase font_black font-weight-bold">
							FILL THE FORM TO SEARCH A RECYCLED MATERIAL AND UPDATE IT
						</h3>
						<hr class="divider border_light my-4" />
					</div>
					<div class="col-lg-8 align-self-start">
						<form action="/gaia/FrontController.do" method="post">
							<div class="form-group text-center">
								<label class="font_black" for="inputMaterial">Recycled material name</label>
								<input type="text" class="form-control" id="inputMaterial" name="name" placeholder="" required>
							</div>
							<div class="col-lg-12 text-center">
								<input type="hidden" name="command" value="UpdateMaterialSearchCommand">
								<input type="submit" class="btn btn-gradient btn-find padding-btn" id="btn_find" value="SEARCH">
							</div>
						</form>
					</div>
				</div>
			</div>
        </div>
	</section>
	<!-- Footer-->
	<jsp:include page="../common/footer.jsp" />
</body>
</html>