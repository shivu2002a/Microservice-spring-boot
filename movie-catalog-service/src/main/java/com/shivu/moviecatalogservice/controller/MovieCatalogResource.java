package com.shivu.moviecatalogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.shivu.moviecatalogservice.model.CatalogItem;
import com.shivu.moviecatalogservice.model.Movie;
import com.shivu.moviecatalogservice.model.Rating;
import com.shivu.moviecatalogservice.model.UserRating;

//import org.springframework.web.reactive.function.client.WebClient.Builder;
//import org.springframework.web.reactive.function.client.WebClient;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		//Get all rated movies
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRating.class);
		for (Rating rating : ratings.getList()) {
			System.out.println(rating.getMovieId() + " " + rating.getRating());
			
		}
		
		return ratings.getList().stream().map(r -> {
				   //For all rated movies, call movie info service and get details
				   Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + r.getMovieId(), Movie.class);	   
				   //put them together
				   return new CatalogItem(movie.getName(), movie.getTagline(), movie.getDescription(), r.getRating());
			   	   }).collect(Collectors.toList());

	}
	
	public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId){
		return Arrays.asList(new CatalogItem("No movie", "no tagline", "null", 0));
	}

}

//				   Movie movie = webClientBuilder.build()
//				   				.get()
//				   				.uri("http://localhost:8083/movies/" + r.getMovieId())
//				   				.retrieve()
//				   				.bodyToMono(Movie.class)
//				   				.block();