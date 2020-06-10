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
		class="margin-t-93 padding-t-55 animate__animated animate__fadeIn"
		id="collection">
		<div class="wrapper">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-10 text-center">
						<h3 class="text-uppercase font_black font-weight-bold">Enter
							your address to find the nearest collection point to you.</h3>
						<hr class="divider border_light my-4" />
					</div>
					<div class="col-lg-8 align-self-start">
						<form action="/gaia/FrontController.do" method="get">
							<%-- <div class="form-row">
								<div class="form-group col-md-4">
								</div>
								<div class="form-group col-md-4 text-center">
									<label class="font_black" for="inputMaterial">Material</label>
									<select id="inputMaterial" name="material" class="form-control border_light">
										<option disabled selected>Select option</option> 
										<c:forEach items="${allRecycledMaterials}"  var="recycled">
											<option value="${recycled.name}">${recycled.name}</option>       
										</c:forEach> 
									</select>
								</div>
							</div> --%>
							<div class="form-group text-center">
								<label class="font_black" for="inputAddress">Address</label> <input
									type="text" class="form-control border_light" id="inputAddress"
									name="address" placeholder="Street Rose Bushes" required>
							</div>
							<div class="form-group text-center">
								<label class="font_black" for="inputAddress2">Neighborhood</label>
								<input type="text" class="form-control border_light"
									id="inputAddress2" name="neighborhood"
									placeholder="Village Park" required>
							</div>
							<div class="form-row text-center">
								<div class="form-group col-md-6">
									<label class="font_black" for="inputCity">City</label> <input
										type="text" class="form-control border_light" id="inputCity"
										name="city" placeholder="New York" required>
								</div>
								<div class="form-group col-md-3 text-center">
									<label class="font_black" for="inputEstado">State</label> <select
										id="inputEstado" name="state"
										class="form-control border_light">
										<option disabled selected>Select option</option>
										<option value="AC">Acre</option>
										<option value="AL">Alagoas</option>
										<option value="AC">Amapá</option>
										<option value="AM">Amazonas</option>
										<option value="BA">Bahia</option>
										<option value="CE">Ceará</option>
										<option value="DF">Distrito Federal</option>
										<option value="ES">Espírito Santo</option>
										<option value="GO">Goiás</option>
										<option value="MA">Maranhão</option>
										<option value="MT">Mato Grosso</option>
										<option value="MS">Mato Grosso do Sul</option>
										<option value="MG">Minas Gerais</option>
										<option value="PA">Pará</option>
										<option value="PB">Paraíba</option>
										<option value="PR">Paraná</option>
										<option value="PE">Pernambuco</option>
										<option value="PI">Piauí</option>
										<option value="RJ">Rio de Janeiro</option>
										<option value="RN">Rio Grande do Norte</option>
										<option value="RS">Rio Grande do Sul</option>
										<option value="RO">Rondônia</option>
										<option value="RR">Roraima</option>
										<option value="SC">Santa Catarina</option>
										<option value="SP">São Paulo</option>
										<option value="SE">Sergipe</option>
										<option value="TO">Tocantins</option>
									</select>
								</div>
								<div class="form-group col-md-3 text-center">
									<label class="font_black" for="inputCEP">CEP</label> <input
										type="text" class="form-control border_light" id="inputCEP"
										name="cep" placeholder="01234567" required>
								</div>
							</div>
							<div class="col-lg-12 text-center">
								<input type="hidden" name="command" value="MapCommand">
								<button type="submit"
									class="btn btn-gradient btn-find padding-btn" id="btn_find">FIND</button>
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