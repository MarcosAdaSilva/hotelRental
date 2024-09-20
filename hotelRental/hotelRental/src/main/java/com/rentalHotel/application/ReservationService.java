package com.rentalHotel.application;

import org.springframework.stereotype.Service;

import com.rentalHotel.Enum.ReservationStatus;
import com.rentalHotel.domain.Reservation;
import com.rentalHotel.infrastructure.ReservationRepository;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation reserveRoom(Reservation reservation) {
        reservation.setStatus(ReservationStatus.CONFIRMED.name());
        return reservationRepository.save(reservation);
    }
}
