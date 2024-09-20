package com.rentalHotel.Configuration;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.rentalHotel.Mappers.ReservationMapper;

@Configuration
public class AppConfig {
    @Bean
    public ReservationMapper reservationMapper() {
        return Mappers.getMapper(ReservationMapper.class);
    }
}
