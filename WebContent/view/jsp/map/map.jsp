<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="br.com.gaia.model.Gaia" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- JavaScript Library for the map -->
	<link rel="stylesheet" href="https://openlayers.org/en/v4.6.5/css/ol.css" type="text/css">
	<script src="https://openlayers.org/en/v4.6.5/build/ol.js" type="text/javascript"></script>
	<!-- Other imports -->
	<jsp:include page="../common/imports.jsp" />
</head>
<body id="page-top">
	<!-- Menu -->
	<jsp:include page="../common/menu.jsp" />
	<!-- Page -->
	<section
		class="margin-t-93 padding-t-55 animate__animated animate__fadeIn">
		<div class="wrapper">
			<div class="container">
				<c:forEach items="${addressList}" var="gaia">
					<div class="row justify-content-center">
						<div class="col-lg-10 text-center">
							<h3 class="text-uppercase font_black font-weight-bold">${gaia.establishment}</h3>
							<hr class="divider border_light my-4" />
						</div>
						<div class="col-lg-0 align-self-start">
							<div class="form-row">
								<div class="form-group text-center">
									<p>
										<b>Adress:</b> ${gaia.address}
									</p>
									<br>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<div id="map" class="map">
		<script type="text/javascript">
			<%ArrayList<Gaia> list = new ArrayList<>(); 
			list = (ArrayList<Gaia>)request.getAttribute("addressList"); 
			Gaia firstObject = list.get(0);%>
	   		
			var baseMapLayer = new ol.layer.Tile({
				source: new ol.source.OSM()
			});
	   		
			var map = new ol.Map({
				target: 'map',
				layers: [ baseMapLayer],
				view: new ol.View({
					center: ol.proj.fromLonLat([<%=firstObject.getPosition().getLng()%>, <%=firstObject.getPosition().getLat()%>]), 
					zoom: 13
				})
			});
	   		
			var markerArray = [];
			<%for(Gaia gaia : list) {%>
				var marker = new ol.Feature({
					geometry: new ol.geom.Point(
					ol.proj.fromLonLat([<%=gaia.getPosition().getLng()%>,<%=gaia.getPosition().getLat()%>])
					),  
				});
				
				marker.setStyle(new ol.style.Style({
					image: new ol.style.Icon(({
						color: '#ffcd46',
						crossOrigin: 'anonymous',
						src: 'https://miro.medium.com/max/20/1*SQI_HuavHth418JorokW1Q.png'
					}))
				}));
				
				markerArray.push(marker);
			<%}%>	
			
			var vectorSource = new ol.source.Vector({
				features: markerArray
			});
			var markerVectorLayer = new ol.layer.Vector({
				source: vectorSource,
			});
			map.addLayer(markerVectorLayer);	
		</script>
	</div>
	<!-- Footer-->
	<jsp:include page="../common/footer.jsp" />  
</body>
</html>