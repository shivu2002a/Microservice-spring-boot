package com.shivu.ratingsdataservice.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.shivu.ratingsdataservice.model.Rating;
import com.shivu.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

	@RequestMapping("/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserMovieRating(@PathVariable("userId") String userId) {
		List<Rating> list =  Arrays.asList(
				new Rating("1234", 4),
				new Rating("5678", 3));
		UserRating userRating = new UserRating();
		userRating.setList(list);
		return userRating;
	}
	
}
