package com.Pen.Pens.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class PenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String color;
    private String shape;
    private String grip;

    public PenEntity(int id, String name, String color, String shape, String grip) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.shape = shape;
        this.grip = grip;
    }
    public PenEntity(){
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
        PenEntity penEntity = (PenEntity) o;
        return id == penEntity.id && Objects.equals(name, penEntity.name) && Objects.equals(color, penEntity.color) && Objects.equals(shape, penEntity.shape) && Objects.equals(grip, penEntity.grip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, shape, grip);
    }

    @Override
    public String toString() {
        return "PenEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", grip='" + grip + '\'' +
                '}';
    }
}
