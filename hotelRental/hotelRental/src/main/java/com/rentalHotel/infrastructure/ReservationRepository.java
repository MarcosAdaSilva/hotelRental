package com.rentalHotel.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalHotel.domain.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
