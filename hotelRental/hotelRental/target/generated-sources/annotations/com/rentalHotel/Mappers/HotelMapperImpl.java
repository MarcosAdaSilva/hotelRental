package com.rentalHotel.Mappers;

import com.rentalHotel.domain.Hotel;
import com.rentalHotel.web.HotelDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-20T10:33:45-0300",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class HotelMapperImpl implements HotelMapper {

    @Override
    public HotelDTO toDTO(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        HotelDTO hotelDTO = new HotelDTO();

        hotelDTO.setPrice( hotel.getPrice() );
        hotelDTO.setAvailableRooms( hotel.getRooms() );
        hotelDTO.setName( hotel.getName() );
        hotelDTO.setLocation( hotel.getLocation() );

        return hotelDTO;
    }

    @Override
    public Hotel toEntity(HotelDTO hotelDTO) {
        if ( hotelDTO == null ) {
            return null;
        }

        double price = 0.0d;
        int rooms = 0;
        String name = null;
        String location = null;

        price = hotelDTO.getPrice();
        rooms = hotelDTO.getAvailableRooms();
        name = hotelDTO.getName();
        location = hotelDTO.getLocation();

        Hotel hotel = new Hotel( name, location, price, rooms );

        return hotel;
    }
}
