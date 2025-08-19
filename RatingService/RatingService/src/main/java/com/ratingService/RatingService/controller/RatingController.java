  package com.ratingService.RatingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingService.RatingService.entities.Rating;
import com.ratingService.RatingService.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingService.getAllRatings());
	}
	
	@GetMapping("/users/{UserId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String UserId){
		return ResponseEntity.ok(ratingService.getRatingsByUserId(UserId));
	}
	
	@GetMapping("/hotels/{HotelId}") 
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String HotelId){
		return ResponseEntity.ok(ratingService.getRatingsByHotelId(HotelId));
	}
	
}
