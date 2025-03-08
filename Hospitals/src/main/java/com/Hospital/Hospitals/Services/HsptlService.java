package com.Hospital.Hospitals.Services;

import com.Hospital.Hospitals.Dto.HospitalDto;
import com.Hospital.Hospitals.Entity.Hospitals;

public interface HsptlService {
    HospitalDto saveHospital(HospitalDto hospitalDto);
    HospitalDto getHospital(int id);
    HospitalDto updateHospital(int id,HospitalDto hospitalDto);
    Hospitals deleteHospital(int id);
}
