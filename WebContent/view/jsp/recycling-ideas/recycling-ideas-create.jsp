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
		<div class="wrapper padding-b-20">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-10 text-center">
						<h3 class="text-uppercase font_black font-weight-bold">FILL
							THE FORM TO REGISTER A NEW RECIPE</h3>
						<hr class="divider border_light my-4" />
					</div>
					<div class="col-lg-8 align-self-start">
						<form action="/gaia/FrontController.do" method="post">
							<div class="form-row">
								<div class="form-group col-md-4"></div>
								<div class="form-group col-md-4 text-center">
									<label class="font_black" for="inputMaterial">Main
										material</label> <select id="inputMaterial" name="material"
										class="form-control border_light">
										<option></option>
										<c:forEach items="${allRecycledMaterials}" var="recycled">
											<option value="${recycled.name}">${recycled.name}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="form-group text-center">
								<label class="font_black" for="inputCod">Identifier code</label>
								<input type="text" class="form-control border_light"
									id="inputCod" name="code" placeholder="100" required>
							</div>
							<div class="form-group text-center">
								<label class="font_black" for="inputTitle">Title</label> <input
									type="text" class="form-control border_light" id="inputTitle"
									name="title" placeholder="Jewel box" required>
							</div>
							<div class="form-group text-center">
								<label class="font_black" for="inputIngred">Ingredients</label>
								<textarea class="form-control border_light" id="inputIngred"
									rows="5" name="ingredients"
									placeholder="-Ingredient 01 &#10;-Ingredient 02 &#10;-Ingredient 03"
									required></textarea>
							</div>
							<div class="form-group text-center">
								<label class="font_black" for="inputText">Step by step</label>
								<textarea class="form-control border_light" id="inputText"
									rows="20" name="step"
									placeholder="-Step 01 &#10;-Step 02 &#10;-Step 03" required></textarea>
							</div>
							<div class="col-lg-12 text-center">
								<input type="hidden" name="command" value="CreateIdeasCommand">
								<input type="submit"
									class="btn btn-gradient btn-find padding-btn" id="btn_find"
									value="REGISTER">
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