package com.Doctor.Doctors.Services;

import com.Doctor.Doctors.Entity.Doctors;
import com.Doctor.Doctors.Repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

@Service
public class DoctorServices implements DoctorsService{
    @Autowired
    private DoctorRepo doctorRepo;

    public Doctors saveDoctor(MultipartFile doctor, String name, String email, String qualification) throws SQLException, IOException {
        Doctors doctors = new Doctors();
        doctors.setName(name);
        doctors.setEmail(email);
        doctors.setQualification(qualification);
        if (!doctor.isEmpty()) {
            byte[] photoBlob = doctor.getBytes();
//            Byte photoBlob= new Byte();
            doctors.setPhoto(photoBlob);
        }
        return doctorRepo.save(doctors);
    }

    @Override
    public Doctors getDoctors(int id) {

        return doctorRepo.findById(id);
    }

    @Override
    public Doctors updateDoctors(int id, String name, String email, byte[] photo) {

        Doctors doctors =doctorRepo.findById(id);
        if (name != null) doctors.setName(name);
        if (email != null) doctors.setEmail(email);
        if (photo != null && photo.length > 0) {
            byte[] photo1 = new byte[0];
            doctors.setPhoto(photo1);
        }

        return doctorRepo.save(doctors);
    }

    public void deleteDoctors(int id) {
        Doctors doctors=doctorRepo.findById(id); // Assuming findById returns null if not found
        if (doctors != null) {
           doctorRepo.deleteById(id);
        } else {
            throw new RuntimeException("Exam not found with id: " + id);
        }
    }




}
