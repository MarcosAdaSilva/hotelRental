package com.rentalHotel.application;

import org.springframework.stereotype.Service;
import com.rentalHotel.domain.Hotel;
import com.rentalHotel.infrastructure.HotelRepository;
import java.util.List;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> searchHotels(String location) {
        return hotelRepository.findByLocation(location);
    }

    // Additional methods to compare hotels
}
