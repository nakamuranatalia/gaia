package br.com.gaia.model;

public class Position {

	private Float lat;
	private Float lng;
	
	public Position() {
		
	}
	
	public Position(Float lat, Float lng) {
		this.lat = lat;
		this.lng = lng;
	}
	
	public Float getLat() {
		return lat;
	}
	public Float getLng() {
		return lng;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	public void setLng(Float lng) {
		this.lng = lng;
	}
}