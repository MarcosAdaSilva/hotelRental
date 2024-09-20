package com.rentalHotel.application;

import com.rentalHotel.domain.Reservation;

public interface NotificationService {
    void notifyReservation(Reservation reservation);
}
