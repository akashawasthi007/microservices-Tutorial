package com.ratingService.RatingService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingService.RatingService.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating,Long> {

	List<Rating> findAllRatingsByHotelId(String id);
	List<Rating> findAllRatingsByUserId(String id);

}
