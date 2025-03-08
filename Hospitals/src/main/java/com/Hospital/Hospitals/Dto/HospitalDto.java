package com.Hospital.Hospitals.Dto;

import java.util.Objects;

public class HospitalDto {
    private int id;
    private String name;
    private String types;
    private String specialization;
    private Double shifttiming;
    private Double consultationfee;

    public HospitalDto(int id, String name, String types, String specialization, Double shifttiming, Double consultationfee) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.specialization = specialization;
        this.shifttiming = shifttiming;
        this.consultationfee = consultationfee;
    }
    public HospitalDto(){
        super();
    }

    public HospitalDto(int id, String name, String types, String specialization, Object o, Double shifttiming, Double consultationfee) {
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
        HospitalDto that = (HospitalDto) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(types, that.types) && Objects.equals(specialization, that.specialization) && Objects.equals(shifttiming, that.shifttiming) && Objects.equals(consultationfee, that.consultationfee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, types, specialization, shifttiming, consultationfee);
    }

    @Override
    public String toString() {
        return "HospitalDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", types='" + types + '\'' +
                ", specialization='" + specialization + '\'' +
                ", shifttiming=" + shifttiming +
                ", consultationfee=" + consultationfee +
                '}';
    }
}
