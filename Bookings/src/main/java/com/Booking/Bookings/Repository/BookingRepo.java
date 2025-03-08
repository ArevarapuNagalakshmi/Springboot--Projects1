package com.Booking.Bookings.Repository;

import com.Booking.Bookings.Entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepo extends JpaRepository<Bookings,Integer> {
    Optional<Bookings>findById(int id);

}
