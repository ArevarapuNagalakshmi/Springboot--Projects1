package com.Hospital.Hospitals.Controller;

import com.Hospital.Hospitals.Dto.HospitalDto;
import com.Hospital.Hospitals.Entity.Hospitals;
import com.Hospital.Hospitals.Services.HsptlServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospitals")
//@AllArgsConstructor
public class HospitalController {

    @Autowired
    private HsptlServicesImpl hsptlServices;

    @PostMapping("/savehospital")
    public ResponseEntity <HospitalDto>saveHospital(@RequestBody HospitalDto hospitalDto){
        HospitalDto hospitalDto1=hsptlServices.saveHospital(hospitalDto);
        return new ResponseEntity<>(hospitalDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<HospitalDto>getHospital(@PathVariable int id){
    HospitalDto hospitalDto=hsptlServices.getHospital(id);
        return new ResponseEntity<>(hospitalDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<HospitalDto> updateHospital(@PathVariable int id,
                                                     @RequestBody HospitalDto hospitalDto){
     HospitalDto hospitalDto1=hsptlServices.updateHospital(id,hospitalDto);
        return new ResponseEntity<>(hospitalDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Hospitals>deleteHospital(@PathVariable int id){
   Hospitals hospitalDto=hsptlServices.deleteHospital(id);
        return new ResponseEntity<>(hospitalDto,HttpStatus.OK);
    }


}
