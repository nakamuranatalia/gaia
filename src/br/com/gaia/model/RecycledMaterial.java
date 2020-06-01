package br.com.gaia.model;

public class RecycledMaterial {
	
	private int identifierCd;
	private String name;
	
	public RecycledMaterial() {
		
	}
	
	public RecycledMaterial(String name) {
		this.name = name;
	}
	
	public RecycledMaterial(int identifierCd, String name) {
		this.identifierCd = identifierCd;
		this.name = name;
	}

	public int getIdentifierCd() {
		return identifierCd;
	}

	public String getName() {
		return name;
	}

	public void setIdentifierCd(int identifierCd) {
		this.identifierCd = identifierCd;
	}

	public void setName(String name) {
		this.name = name;
	}
}
