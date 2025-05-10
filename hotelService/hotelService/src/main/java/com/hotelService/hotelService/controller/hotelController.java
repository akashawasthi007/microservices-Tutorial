package com.hotelService.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelService.hotelService.entities.Hotel;
import com.hotelService.hotelService.services.hotelService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/hotel")
public class hotelController {

    @Autowired
    private hotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel response = hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/getHotel/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable Long id)
    {
        Hotel response = hotelService.getHotel(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels()
    {
        List<Hotel> allhotels = hotelService.getAllHotels();
        return ResponseEntity.ok(allhotels);
    }

}
