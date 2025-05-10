package com.hotelService.hotelService.services;

import java.util.List;

import com.hotelService.hotelService.entities.Hotel;

public interface hotelService {

    Hotel createHotel(Hotel hotel);

    Hotel getHotel(Long id);

    List<Hotel> getAllHotels();

}
