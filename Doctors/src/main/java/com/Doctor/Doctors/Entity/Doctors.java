package com.Doctor.Doctors.Entity;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Objects;

@Entity
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String qualification;

    @Lob
    private byte[] photo;

    public Doctors(int id, String name, String email, String qualification, byte[] photo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.qualification = qualification;
        this.photo = photo;
    }

    public Doctors(String name, String email, String qualification, byte[] photo) {
        this.name = name;
        this.email = email;
        this.qualification = qualification;
        this.photo = photo;
    }

    public Doctors() {
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doctors doctors = (Doctors) o;
        return id == doctors.id && Objects.equals(name, doctors.name) && Objects.equals(email, doctors.email) && Objects.equals(qualification, doctors.qualification) && Objects.deepEquals(photo, doctors.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, qualification, Arrays.hashCode(photo));
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", photo=" + Arrays.toString(photo) +
                '}';
    }
}
