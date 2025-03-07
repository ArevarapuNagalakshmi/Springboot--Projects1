package com.Booking.Bookings.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
}
