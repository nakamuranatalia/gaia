<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<section
		class="margin-t-93 padding-t-55 animate__animated animate__fadeIn">
		<div class="wrapper">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-10 text-center">
						<h3 class="text-uppercase font_black font-weight-bold">ENTER
							YOUR MATERIAL AND FIND THE RIGHT RECIPE FOR YOU</h3>
						<hr class="divider border_light my-4" />
					</div>
					<div class="col-lg-8 align-self-start">
						<form action="/gaia/FrontController.do" method="get">
							<div class="form-row">
								<div class="form-group col-md-4"></div>
								<div class="form-group col-md-4 text-center">
									<label class="font_black" for="inputMaterial">Main
										material</label> <select id="inputMaterial" name="material"
										class="form-control border_light">
										<option>Select option</option>
										<c:forEach items="${allRecycledMaterials}" var="recycled">
											<option value="${recycled.name}">${recycled.name}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="col-lg-12 text-center">
								<input type="hidden" name="command" value="ReadAllIdeasCommand">
								<input type="submit"
									class="btn btn-gradient btn-find padding-btn" id="btn_find"
									value="SEARCH">
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