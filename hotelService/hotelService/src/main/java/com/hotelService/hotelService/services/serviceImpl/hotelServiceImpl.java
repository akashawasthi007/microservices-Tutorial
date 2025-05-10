package com.hotelService.hotelService.services.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelService.hotelService.entities.Hotel;
import com.hotelService.hotelService.exception.ResourceNotFoundException;
import com.hotelService.hotelService.reporitories.HotelRepository;
import com.hotelService.hotelService.services.hotelService;

@Service
public class hotelServiceImpl implements hotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        // TODO Auto-generated method stub
        return (Hotel) hotelRepository.save(hotel);
        // throw new UnsupportedOperationException("Unimplemented method 'createHotel'");
    }

    @SuppressWarnings("deprecation")
    @Override
    public Hotel getHotel(Long id) {
        // TODO Auto-generated method stub
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found Exception caught"));
        //throw new UnsupportedOperationException("Unimplemented method 'getHotel'");
    }

    @Override
    public List<Hotel> getAllHotels() {
        // TODO Auto-generated method stub

        List<Hotel> allHotels = hotelRepository.findAll();
        return allHotels;
        //throw new UnsupportedOperationException("Unimplemented method 'getAllHotels'");
    }

    

}
