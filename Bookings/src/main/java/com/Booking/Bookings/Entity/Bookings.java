package com.Booking.Bookings.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  Double pnum;
    private String type;
    private Double price;

    public Bookings(int id, String name, Double pnum, String type, Double price) {
        this.id = id;
        this.name = name;
        this.pnum = pnum;
        this.type = type;
        this.price = price;
    }
    public Bookings(){
        super();
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
        Bookings bookings = (Bookings) o;
        return id == bookings.id && Objects.equals(name, bookings.name) && Objects.equals(pnum, bookings.pnum) && Objects.equals(type, bookings.type) && Objects.equals(price, bookings.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pnum, type, price);
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pnum=" + pnum +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
