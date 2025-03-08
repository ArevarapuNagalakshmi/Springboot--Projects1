package com.Booking.Bookings.Dto;

import java.util.Objects;

public class BookingDto {
    private int id;
    private String name;
    private  Double pnum;
    private String type;
    private Double price;

    public BookingDto(int id, String name, Double pnum, String type, Double price) {
        this.id = id;
        this.name = name;
        this.pnum = pnum;
        this.type = type;
        this.price = price;
    }
    public BookingDto(){
        super();
    }

    public BookingDto(int id, String name, Double pnum, String type, Double price, Object o) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPnum() {
        return pnum;
    }

    public void setPnum(Double pnum) {
        this.pnum = pnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookingDto that = (BookingDto) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(pnum, that.pnum) && Objects.equals(type, that.type) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pnum, type, price);
    }

    @Override
    public String toString() {
        return "BookingDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pnum=" + pnum +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
