package com.rentalHotel.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentalHotel.application.HotelService;
import com.rentalHotel.domain.Hotel;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<HotelDTO>> searchHotels(@RequestParam String location) {
        List<Hotel> hotels = hotelService.searchHotels(location);
        return ResponseEntity.ok(hotels.stream().map(HotelDTO::fromEntity).toList());
    }
}
