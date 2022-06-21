package com.shivu.moviecatalogservice.model;

public class Movie {
	
	private String id;
	private String tagline;
	private String name;
	private String description;
	
	public Movie() {
		
	}
	
	public Movie(String id, String tagLine, String name, String description) {
		this.id = id;
		this.tagline = tagLine;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description= description;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagLine) {
		this.tagline = tagLine;
	}
	
	
	

}
