package com.rentalHotel.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.rentalHotel.application.ReservationService;
import com.rentalHotel.domain.Reservation;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        Reservation savedReservation = reservationService.reserveRoom(reservation);
        return ResponseEntity.ok(savedReservation);
    }
}
