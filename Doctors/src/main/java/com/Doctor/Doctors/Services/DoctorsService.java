package com.Doctor.Doctors.Services;

import com.Doctor.Doctors.Entity.Doctors;

public interface DoctorsService {
    Doctors getDoctors(int id);
    Doctors updateDoctors(int id, String name, String email, byte[] photo);
}
