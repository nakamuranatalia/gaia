package br.com.gaia.model;

public class RecyclingIdeas{
	
	private int identifierCd;
	private String title;
	private String materials;
	private String steps;
	private RecycledMaterial recycledMaterial;
	
	public RecyclingIdeas() {
		
	}

	public RecyclingIdeas(int identifierCd, String title, RecycledMaterial recycledMaterial, String materials, String steps) {
		this.identifierCd = identifierCd;
		this.title = title;
		this.recycledMaterial = recycledMaterial;
		this.materials = materials;
		this.steps = steps;
	}

	public int getIdentifierCd() {
		return identifierCd;
	}

	public String getTitle() {
		return title;
	}
	
	public String getMaterials() {
		return materials;
	}

	public String getSteps() {
		return steps;
	}
	
	public RecycledMaterial getRecycledMaterial() {
		return recycledMaterial;
	}

	public void setIdentifierCd(int identifierCd) {
		this.identifierCd = identifierCd;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}
	
	public void setRecycledMaterial(RecycledMaterial recycledMaterial) {
		this.recycledMaterial = recycledMaterial;
	}
}