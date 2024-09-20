package com.rentalHotel.Mappers;

import com.rentalHotel.domain.Reservation;
import com.rentalHotel.web.ReservationDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-20T10:43:50-0300",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationDTO toDTO(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDTO reservationDTO = new ReservationDTO();

        if ( reservation.getRooms() != null ) {
            reservationDTO.setRooms( Integer.parseInt( reservation.getRooms() ) );
        }
        reservationDTO.setUserId( reservation.getUserId() );
        reservationDTO.setCheckInDate( reservation.getCheckInDate() );
        reservationDTO.setCheckOutDate( reservation.getCheckOutDate() );
        reservationDTO.setCustomerName( reservation.getCustomerName() );
        reservationDTO.setHotelId( reservation.getHotelId() );
        reservationDTO.setId( reservation.getId() );
        reservationDTO.setStatus( reservation.getStatus() );

        return reservationDTO;
    }

    @Override
    public Reservation toEntity(ReservationDTO reservationDTO) {
        if ( reservationDTO == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setRooms( String.valueOf( reservationDTO.getRooms() ) );
        reservation.setUserId( reservationDTO.getUserId() );
        reservation.setCheckInDate( reservationDTO.getCheckInDate() );
        reservation.setCheckOutDate( reservationDTO.getCheckOutDate() );
        reservation.setCustomerName( reservationDTO.getCustomerName() );
        reservation.setHotelId( reservationDTO.getHotelId() );
        reservation.setId( reservationDTO.getId() );
        reservation.setStatus( reservationDTO.getStatus() );

        return reservation;
    }
}
