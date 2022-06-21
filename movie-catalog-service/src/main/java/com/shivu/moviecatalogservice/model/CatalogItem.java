package com.shivu.moviecatalogservice.model;

public class CatalogItem {
	
	private String name;
	private String tagline;
	private String desc;
	private int rating;
	
	public CatalogItem() {
		
	}
	
	public CatalogItem(String name, String tagLine, String desc, int rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
		this.tagline = tagLine;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTagLine() {
		return tagline;
	}

	public void setTagLine(String tagLine) {
		this.tagline = tagLine;
	}
	
}
