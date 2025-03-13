package com.Doctor.Doctors.Controllers;

import com.Doctor.Doctors.Entity.Doctors;
import com.Doctor.Doctors.Services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorServices doctorServices;

    @PostMapping("/save")
    public ResponseEntity<Doctors> saveDoctor(@RequestParam("photo") MultipartFile photo,
                                              @RequestParam("name") String name,
                                              @RequestParam("email") String email,
                                              @RequestParam("qualification")String qualification) throws SQLException, IOException {
         Doctors doctors=doctorServices.saveDoctor(photo,name,email,qualification);
        return new ResponseEntity<>(doctors,HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Doctors>getDoctors(@PathVariable int id) throws SQLException,IOException{
        Doctors doctors=doctorServices.getDoctors(id);
        return new ResponseEntity<>(doctors,HttpStatus.OK);
    }
@PutMapping("/{id}")
    public ResponseEntity<Doctors> updateDoctors(
            @PathVariable int id,
            @RequestParam(value = "photo", required = false) MultipartFile photo,
            @RequestParam("name") String name,
            @RequestParam("email") String email) throws IOException {

        byte[] photoBytes = (photo != null && !photo.isEmpty()) ? photo.getBytes() : null;

        Doctors updatedDoctor = doctorServices.updateDoctors(id, name, email, photoBytes);

        return ResponseEntity.ok(updatedDoctor);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Doctors> deleteDoctors(@PathVariable int id){
        doctorServices.deleteDoctors(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
