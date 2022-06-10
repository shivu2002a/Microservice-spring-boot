package com.shivu.ratingsdataservice.model;

import java.util.List;

public class UserRating {
	
	private List<Rating> list;
	
	public UserRating() {
		
	}

	public List<Rating> getList() {
		return list;
	}

	public void setList(List<Rating> list) {
		this.list = list;
	}

}
