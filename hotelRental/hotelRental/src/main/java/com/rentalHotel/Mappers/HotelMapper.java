package com.rentalHotel.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.rentalHotel.domain.Hotel;
import com.rentalHotel.web.HotelDTO;

@Mapper
public interface HotelMapper {
    @Mapping(source = "price", target = "price")
    @Mapping(source = "rooms", target = "availableRooms")
    HotelDTO toDTO(Hotel hotel);

    @Mapping(source = "price", target = "price")
    @Mapping(source = "availableRooms", target = "rooms")
    Hotel toEntity(HotelDTO hotelDTO);
}
