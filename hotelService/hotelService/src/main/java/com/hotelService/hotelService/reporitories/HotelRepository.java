package com.hotelService.hotelService.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelService.hotelService.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

}
