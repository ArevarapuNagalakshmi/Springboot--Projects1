package com.Booking.Bookings.Services;

import com.Booking.Bookings.Dto.BookingDto;
import com.Booking.Bookings.Entity.Bookings;

public interface BookingServices {
    BookingDto saveBooking(BookingDto bookingDto);
    BookingDto getBooking(int id);
    BookingDto updateBooking(int id,BookingDto bookingDto);
    Bookings deleteBooking(int id);


}
