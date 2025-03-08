package com.Booking.Bookings.Services;

import com.Booking.Bookings.Dto.BookingDto;
import com.Booking.Bookings.Entity.Bookings;
import com.Booking.Bookings.Repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService implements BookingServices {
    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public BookingDto saveBooking(BookingDto bookingDto) {
        Bookings bookings=new Bookings(
                bookingDto.getId(),
                bookingDto.getName(),
                bookingDto.getPnum(),
                bookingDto.getType(),
                bookingDto.getPrice()
        );
        Bookings bookings1=bookingRepo.save(bookings);
        BookingDto bookingDto1 =new BookingDto(
                bookings1.getId(),
                bookings1.getName(),
                bookings1.getPnum(),
                bookings1.getType(),
                bookings1.getPrice()
        );
        return bookingDto1;
    }

    @Override
    public BookingDto getBooking(int id) {
        Bookings bookings=bookingRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The Booking id is n or found :"+id));
        BookingDto bookingDto=new BookingDto(
                bookings.getId(),
                bookings.getName(),
                bookings.getPnum(),
                bookings.getType(),
                bookings.getPrice()
        );
        return bookingDto;
    }

    @Override
    public BookingDto updateBooking(int id, BookingDto bookingDto) {
        Bookings bookings=bookingRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The booking id is not found :"+id));
        bookings.setName(bookingDto.getName());
        bookings.setPnum(bookingDto.getPnum());
        bookings.setType(bookingDto.getType());
        bookings.setPrice(bookingDto.getPrice());
        Bookings bookings1=bookingRepo.save(bookings);
        BookingDto bookingDto1=new BookingDto(
                  bookings1.getId(),
                  bookings1.getName(),
                  bookings1.getPnum(),
                  bookings1.getType(),
                  bookings1.getPrice());
        return bookingDto1;
    }



    @Override
    public Bookings deleteBooking(int id) {
        Bookings bookings=bookingRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The booking id is not found:"+id));
        bookingRepo.deleteById(id);
        return null;
    }

}
