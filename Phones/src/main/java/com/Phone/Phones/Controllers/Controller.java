package com.Phone.Phones.Controllers;

import com.Phone.Phones.Dto.PhoneDto;
import com.Phone.Phones.Entity.Phones;
import com.Phone.Phones.Services.PhoneServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phones")
public class Controller {
    @Autowired
    private PhoneServices phoneServices;
    @PostMapping("/savephone")
    public ResponseEntity<PhoneDto>savePhone(@RequestBody PhoneDto phoneDto){
        PhoneDto phoneDto1=phoneServices.savePhone(phoneDto);
        return new ResponseEntity<>(phoneDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PhoneDto>getPhone(@PathVariable int id){
        PhoneDto phoneDto=phoneServices.getPhone(id);
        return new ResponseEntity<>(phoneDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PhoneDto>updatePhone(@PathVariable int id,
                                               @RequestBody PhoneDto phoneDto){
    PhoneDto phoneDto1=phoneServices.updatePhone(id,phoneDto);
        return new ResponseEntity<>(phoneDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Phones>deletePhone(@PathVariable int id){
        Phones phones=phoneServices.deletePhone(id);
        return new ResponseEntity<>(phones,HttpStatus.OK);
    }
}
