package com.ratingService.RatingService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingService.RatingService.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating,String> {

}
