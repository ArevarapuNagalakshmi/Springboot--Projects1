package com.Doctor.Doctors.Dto;

import java.sql.Blob;
import java.util.Base64;
import java.util.Objects;

public class DoctorDto {
    private int id;
    private String name;
    private String email;
    private String qualification;
    private String photo; // Store Base64 String instead of byte[]

    // Constructor Without Photo
    public DoctorDto(int id, String name, String email, String qualification) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.qualification = qualification;
    }

    public DoctorDto(String name, String email, String qualification, String photo) {
        this.name = name;
        this.email = email;
        this.qualification = qualification;
        this.photo = photo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DoctorDto doctorDto = (DoctorDto) o;
        return id == doctorDto.id && Objects.equals(name, doctorDto.name) && Objects.equals(email, doctorDto.email) && Objects.equals(qualification, doctorDto.qualification) && Objects.equals(photo, doctorDto.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, qualification, photo);
    }

    @Override
    public String toString() {
        return "DoctorDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
