package com.Doctor.Doctors.Repository;

import com.Doctor.Doctors.Dto.DoctorDto;
import com.Doctor.Doctors.Entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepo extends JpaRepository<Doctors,Integer> {
    Doctors findById(int id);



}
