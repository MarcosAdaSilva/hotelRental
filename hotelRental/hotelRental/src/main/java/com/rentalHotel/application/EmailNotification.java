package com.rentalHotel.application;

import org.springframework.stereotype.Service;
import com.rentalHotel.domain.Reservation;

@Service
public class EmailNotification implements NotificationService {
    public void sendNotification(Reservation reservation) {
        // Implementação do envio de e-mail
    }

    @Override
    public void notifyReservation(Reservation reservation) {
        sendNotification(reservation);
    }
}
