package com.shivu.movieinfoservice.model;

public class Movie {
	
	private String id;
	private String name;
	private String description;
	private String tagline;
	
	public Movie() {
		
	}
	
	public Movie(String id, String name,  String tagLine, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.tagline = tagLine;
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

	public void setTagLine(String tagLine) {
		this.tagline = tagLine;
	}
	
	
	

}
