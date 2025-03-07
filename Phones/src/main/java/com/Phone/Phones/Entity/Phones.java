package com.Phone.Phones.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Phones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String model;
    private String size;
    private String color;
    private String quality;
    private Double gb;

    public Phones(int id, String name, String model, String size, String color, String quality, Double gb) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.size = size;
        this.color = color;
        this.quality = quality;
        this.gb = gb;
    }
    public Phones(){
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Double getGb() {
        return gb;
    }

    public void setGb(Double gb) {
        this.gb = gb;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phones phones = (Phones) o;
        return id == phones.id && Objects.equals(name, phones.name) && Objects.equals(model, phones.model) && Objects.equals(size, phones.size) && Objects.equals(color, phones.color) && Objects.equals(quality, phones.quality) && Objects.equals(gb, phones.gb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, size, color, quality, gb);
    }

    @Override
    public String toString() {
        return "Phones{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", quality='" + quality + '\'' +
                ", gb=" + gb +
                '}';
    }
}
