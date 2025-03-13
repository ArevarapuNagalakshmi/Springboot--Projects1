package com.Exam.Exams.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Lob;

import java.sql.Blob;
import java.util.Base64;
import java.util.Objects;

public class ExamDto {

    private int id;
    private String name;
    private Long govtnum;
    private Long dob;
    private Double yearpass;
    private String center;

   @Lob
    private String photopic;


    public ExamDto() {}


    public ExamDto(int id, String name, Long govtnum, Long dob, Double yearpass, String center, String photopic) {
        this.id = id;
        this.name = name;
        this.govtnum = govtnum;
        this.dob = dob;
        this.yearpass = yearpass;
        this.center = center;
        this.photopic = photopic;  // Accepts direct Base64 input
    }


    public ExamDto(String name, Long govtnum, Long dob, Double yearpass, String center, Blob photopic) {
        this.name = name;
        this.govtnum = govtnum;
        this.dob = dob;
        this.yearpass = yearpass;
        this.center = center;
        this.photopic = photopic.toString();
    }




    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getGovtnum() { return govtnum; }
    public void setGovtnum(Long govtnum) { this.govtnum = govtnum; }

    public Long getDob() { return dob; }
    public void setDob(Long dob) { this.dob = dob; }

    public Double getYearpass() { return yearpass; }
    public void setYearpass(Double yearpass) { this.yearpass = yearpass; }

    public String getCenter() { return center; }
    public void setCenter(String center) { this.center = center; }

    public String getPhotopic() { return photopic; }
    public void setPhotopic(String photopic) { this.photopic = photopic; }  // Accept Base64 directly


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamDto examDto = (ExamDto) o;
        return id == examDto.id && Objects.equals(name, examDto.name) &&
                Objects.equals(govtnum, examDto.govtnum) && Objects.equals(dob, examDto.dob) &&
                Objects.equals(yearpass, examDto.yearpass) && Objects.equals(center, examDto.center) &&
                Objects.equals(photopic, examDto.photopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, govtnum, dob, yearpass, center, photopic);
    }


    @Override
    public String toString() {
        return "ExamDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", govtnum=" + govtnum +
                ", dob=" + dob +
                ", yearpass=" + yearpass +
                ", center='" + center + '\'' +
                ", photopic='" + photopic + '\'' +
                '}';
    }
}
