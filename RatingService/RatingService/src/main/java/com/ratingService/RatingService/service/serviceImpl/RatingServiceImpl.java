package com.ratingService.RatingService.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingService.RatingService.entities.Rating;
import com.ratingService.RatingService.repositories.RatingRepository;
import com.ratingService.RatingService.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepo;

	@Override
	public Rating createRating(Rating rating) {
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingsByUserId(String id) {
		// TODO Auto-generated method stub
		List<Rating> ratingList = ratingRepo.findAllRatingsByUserId(id);
		return ratingList;
	}

	@Override
	public List<Rating> getRatingsByHotelId(String id) {
		// TODO Auto-generated method stub
		List<Rating> ratingList =  ratingRepo.findAllRatingsByHotelId(id);
		return ratingList;
	}

}
