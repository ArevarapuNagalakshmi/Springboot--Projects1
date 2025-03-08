package com.Booking.Bookings.Controllers;

import com.Booking.Bookings.Dto.BookingDto;
import com.Booking.Bookings.Entity.Bookings;
import com.Booking.Bookings.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class Controller {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/savebooking")
    public ResponseEntity<BookingDto>saveBooking(@RequestBody BookingDto bookingDto){
        BookingDto bookingDto1=bookingService.saveBooking(bookingDto);
        return new ResponseEntity<>(bookingDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookingDto>getBooking(@PathVariable int id){
        BookingDto bookingDto1=bookingService.getBooking(id);
        return new ResponseEntity<>(bookingDto1, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookingDto> updateBooking(@PathVariable int id,
                                                    @RequestBody BookingDto bookingDto) {
        BookingDto bookingDto1=bookingService.updateBooking(id,bookingDto);
        return new ResponseEntity<>(bookingDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Bookings>deleteBooking(@PathVariable int id){
         Bookings bookings=bookingService.deleteBooking(id);
        return new ResponseEntity<>(bookings,HttpStatus.OK);
    }


}
