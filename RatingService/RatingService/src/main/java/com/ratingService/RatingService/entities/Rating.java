package com.ratingService.RatingService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_ratings")
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long ratingId;
	
	@Column(name="UserId",length = 20)
    private String userId;
    
	@Column(name="HotelId",length = 20)
	private String hotelId;
	
	@Column(name="Rating",length = 20)
    private String rating;
	
	@Column(name="Feedback",length = 20)
    private String feedback;
	
}
