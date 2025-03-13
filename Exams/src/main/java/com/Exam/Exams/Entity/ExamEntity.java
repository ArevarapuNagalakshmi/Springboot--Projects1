package com.Exam.Exams.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;
import java.util.Objects;

@Entity
@Data
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Long govtnum;
    private Long dob;
    private Double yearpass;
    private String center;


    @Lob
    private byte[] photopic;

    public ExamEntity(String name, Long govtnum, Long dob, Double yearpass, String center, Byte photopic) {
        this.name = name;
        this.govtnum = govtnum;
        this.dob = dob;
        this.yearpass = yearpass;
        this.center = center;
        this.photopic = new byte[0];
    }

    public ExamEntity() {
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

    public Long getGovtnum() {
        return govtnum;
    }

    public void setGovtnum(Long govtnum) {
        this.govtnum = govtnum;
    }

    public Long getDob() {
        return dob;
    }

    public void setDob(Long dob) {
        this.dob = dob;
    }

    public Double getYearpass() {
        return yearpass;
    }

    public void setYearpass(Double yearpass) {
        this.yearpass = yearpass;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public byte[] getPhotopic() {
        return photopic;
    }

    public void setPhotopic(byte[] photopic) {
        this.photopic = photopic;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExamEntity that = (ExamEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(govtnum, that.govtnum) && Objects.equals(dob, that.dob) && Objects.equals(yearpass, that.yearpass) && Objects.equals(center, that.center) && Objects.equals(photopic, that.photopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, govtnum, dob, yearpass, center, photopic);
    }

    @Override
    public String toString() {
        return "ExamEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", govtnum=" + govtnum +
                ", dob=" + dob +
                ", yearpass=" + yearpass +
                ", center='" + center + '\'' +
                ", photopic=" + photopic +
                '}';
    }

    public boolean isPresent() {
        return false;
    }


}
