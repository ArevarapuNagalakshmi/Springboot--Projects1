package com.Pen.Pens.Dto;

import java.util.Objects;

public class PenDto {
    private int id;
    private String name;
    private String color;
    private String shape;
    private String grip;

    public PenDto(int id, String name, String color, String shape, String grip) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.shape = shape;
        this.grip = grip;
    }
    public PenDto(){
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PenDto penDto = (PenDto) o;
        return id == penDto.id && Objects.equals(name, penDto.name) && Objects.equals(color, penDto.color) && Objects.equals(shape, penDto.shape) && Objects.equals(grip, penDto.grip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, shape, grip);
    }

    @Override
    public String toString() {
        return "PenDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", grip='" + grip + '\'' +
                '}';
    }
}
