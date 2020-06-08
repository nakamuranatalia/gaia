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
    <section class="margin-t-93 padding-t-55 animate__animated animate__fadeIn">
        <div class="wrapper padding-b-20">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-10 text-center">
                        <h3 class="text-uppercase font_black font-weight-bold">
                            FILL THE FORM TO UPDATE AN EXISTING RECYCLING IDEA
                        </h3>
                        <hr class="divider border_light my-4" />
                    </div>
                    <div class="col-lg-8 align-self-start">
                        <form action="/gaia/FrontController.do" method="post">
                        	 <div class="form-group text-center">
                                <label class="font_black" for="inputCod">Identifier code: ${recyclingIdeasCd}</label>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-4">
                                </div>
                                <div class="form-group col-md-4 text-center">
                                    <label class="font_black" for="inputMaterial">Main material</label>
                                    <select id="inputMaterial" name="material" class="form-control border_light">
                                      <c:forEach items="${allRecycledMaterial}"  var="recycled">
	                                		<option value="${recycled.name}" ${recycled.name == recyclingIdeasMaterial ? "selected":""}>${recycled.name}</option>       
	                               	  </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group text-center">
                                <label class="font_black" for="inputTitle">Title</label>
                                <input type="text" class="form-control border_light" id="inputTitle" name="title" value="${recyclingIdeasTitle}" required>
                            </div>
                            <div class="form-group text-center">
                                <label class="font_black" for="inputIngred">Ingredients</label>
                                <textarea class="form-control border_light" id="inputIngred" rows="5" name="ingredients" required>${recyclingIdeasMaterials}</textarea>
                            </div>
                            <div class="form-group text-center">
                                <label class="font_black" for="inputText">Step by step</label>
                                <textarea class="form-control border_light" id="inputText" rows="20" name="step" required>${recyclingIdeasSteps}</textarea>
                            </div>
                            <div class="col-lg-12 text-center">
                            	<input type="hidden" name="command" value="UpdateIdeasCommand">
                                <input type="submit" class="btn btn-gradient btn-find padding-btn" id="btn_find" value="UPDATE">
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