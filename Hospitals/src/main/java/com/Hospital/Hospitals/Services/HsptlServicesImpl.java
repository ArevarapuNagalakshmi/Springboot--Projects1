package com.Hospital.Hospitals.Services;

import com.Hospital.Hospitals.Dto.HospitalDto;
import com.Hospital.Hospitals.Entity.Hospitals;
import com.Hospital.Hospitals.Reository.HsptlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HsptlServicesImpl implements HsptlService {

    @Autowired
    private HsptlRepo hsptlRepo;

    @Override
    public HospitalDto saveHospital(HospitalDto hospitalDto) {
        Hospitals hospitals = new Hospitals(
                hospitalDto.getId(),
                hospitalDto.getName(),
                hospitalDto.getTypes(),
                hospitalDto.getSpecialization(),
                hospitalDto.getShifttiming(),
                hospitalDto.getConsultationfee());
        Hospitals hospitals1 = hsptlRepo.save(hospitals);
        HospitalDto hospitalDto1 = new HospitalDto(
                hospitals1.getId(),
                hospitals1.getName(),
                hospitals1.getTypes(),
                hospitals1.getSpecialization(),
                hospitals1.getShifttiming(),
                hospitals1.getConsultationfee()
        );
        return hospitalDto1;
    }

    @Override
    public HospitalDto getHospital(int id) {
        Hospitals hospitals = hsptlRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("The hospital id is not found:" + id));
        HospitalDto hospitalDto = new HospitalDto(
                hospitals.getId(),
                hospitals.getName(),
                hospitals.getTypes(),
               hospitals.getSpecialization(),
                hospitals.getShifttiming(),
                hospitals.getConsultationfee()

        );
        return hospitalDto;
    }

    @Override
    public HospitalDto updateHospital(int id, HospitalDto hospitalDto) {
        Hospitals hospitals = hsptlRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("The hospital id is not found" + id));
        hospitals.setName(hospitalDto.getName());
        hospitals.setTypes(hospitalDto.getTypes());
        hospitals.setSpecialization(hospitalDto.getSpecialization());
        hospitals.setShifttiming(hospitalDto.getShifttiming());
        hospitals.setConsultationfee(hospitalDto.getConsultationfee());
        Hospitals hospitals1 = hsptlRepo.save(hospitals);
        return new HospitalDto(
                hospitals1.getId(),
                hospitals1.getName(),
                hospitals1.getTypes(),
               hospitals1.getSpecialization(),
                hospitals1.getShifttiming(),
                hospitals1.getConsultationfee()
        );
    }

    @Override
    public Hospitals deleteHospital(int id) {
        Hospitals hospitals = hsptlRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("The hospital id is not found" + id));
        hsptlRepo.deleteById(id);
        return hospitals;
    }
}
