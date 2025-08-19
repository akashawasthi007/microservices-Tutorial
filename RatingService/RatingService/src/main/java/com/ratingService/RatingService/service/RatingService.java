package com.ratingService.RatingService.service;

import java.util.List;

import com.ratingService.RatingService.entities.Rating;

public interface RatingService {
	
	Rating createRating(Rating rating);
	
	List<Rating> getAllRatings();

	List<Rating> getRatingsByUserId(String userId);
	
	List<Rating> getRatingsByHotelId(String id);

}
