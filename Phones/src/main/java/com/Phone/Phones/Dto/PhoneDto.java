package com.Phone.Phones.Dto;

import java.util.Objects;

public class PhoneDto {
    private int id;
    private String name;
    private String model;
    private String size;
    private String color;
    private String quality;
    private Double gb;

    public PhoneDto(int id, String name, String model, String size, String color, String quality, Double gb) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.size = size;
        this.color = color;
        this.quality = quality;
        this.gb = gb;
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
        PhoneDto phoneDto = (PhoneDto) o;
        return id == phoneDto.id && Objects.equals(name, phoneDto.name) && Objects.equals(model, phoneDto.model) && Objects.equals(size, phoneDto.size) && Objects.equals(color, phoneDto.color) && Objects.equals(quality, phoneDto.quality) && Objects.equals(gb, phoneDto.gb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, size, color, quality, gb);
    }

    @Override
    public String toString() {
        return "PhoneDto{" +
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
