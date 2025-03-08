package com.Hospital.Hospitals.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Hospitals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String types;
    private String specialization;
    private Double shifttiming;
    private Double consultationfee;

    public Hospitals(int id, String name, String types, String specialization, Double shifttiming, Double consultationfee) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.specialization = specialization;
        this.shifttiming = shifttiming;
        this.consultationfee = consultationfee;
    }
    public Hospitals(){
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

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Double getShifttiming() {
        return shifttiming;
    }

    public void setShifttiming(Double shifttiming) {
        this.shifttiming = shifttiming;
    }

    public Double getConsultationfee() {
        return consultationfee;
    }

    public void setConsultationfee(Double consultationfee) {
        this.consultationfee = consultationfee;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hospitals hospitals = (Hospitals) o;
        return id == hospitals.id && Objects.equals(name, hospitals.name) && Objects.equals(types, hospitals.types) && Objects.equals(specialization, hospitals.specialization) && Objects.equals(shifttiming, hospitals.shifttiming) && Objects.equals(consultationfee, hospitals.consultationfee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, types, specialization, shifttiming, consultationfee);
    }

    @Override
    public String toString() {
        return "Hospitals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", types='" + types + '\'' +
                ", specialization='" + specialization + '\'' +
                ", shifttiming=" + shifttiming +
                ", consultationfee=" + consultationfee +
                '}';
    }
}
