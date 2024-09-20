package com.rentalHotel.infrastructure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rentalHotel.domain.Hotel;

@Component
public class DataLoader implements CommandLineRunner {

    private final HotelRepository hotelRepository;

    public DataLoader(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) {
        // Certifique-se de que o construtor da classe Hotel está definido corretamente com quatro parâmetros
        Hotel hotel1 = new Hotel("Hotel A", "Location A", 100.0, 10);
        hotelRepository.save(hotel1);
    }
}
