package br.com.gaia.model;

import br.com.gaia.model.Position;
import java.io.Serializable;

public class Gaia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String establishment;
    private String address;
    private Position position;
    
    public Gaia() {
    	
    }
    
    public Gaia(String establishment, String address, Position position) {
    	this.establishment = establishment;
    	this.address = address;
    	this.position = position;
    }
    
    public String getEstablishment() {
		return establishment;
	}
	public String getAddress() {
		return address;
	}
	public Position getPosition() {
		return position;
	}
	public void setEstablishment(String establishment) {
		this.establishment = establishment;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
}