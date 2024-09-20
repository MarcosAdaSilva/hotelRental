package com.rentalHotel.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.rentalHotel.domain.Reservation;
import com.rentalHotel.web.ReservationDTO;

@Mapper
public interface ReservationMapper {
    @Mapping(source = "rooms", target = "rooms")
    @Mapping(source = "userId", target = "userId") // Mapeamento correto para userId
    ReservationDTO toDTO(Reservation reservation);

    @Mapping(source = "rooms", target = "rooms")
    @Mapping(source = "userId", target = "userId") // Mapeamento correto para userId
    Reservation toEntity(ReservationDTO reservationDTO);
}
