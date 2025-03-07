package com.Phone.Phones.Services;

import com.Phone.Phones.Dto.PhoneDto;
import com.Phone.Phones.Entity.Phones;
import com.Phone.Phones.Repository.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServices implements PhoneService{
    @Autowired
    private PhoneRepo phoneRepo;
    @Override
    public PhoneDto savePhone(PhoneDto phoneDto) {
        Phones phones=new Phones(
                phoneDto.getId(),
                phoneDto.getName(),
                phoneDto.getModel(),
                phoneDto.getSize(),
                phoneDto.getColor(),
                phoneDto.getQuality(),
                phoneDto.getGb()
        );
        Phones phones1=phoneRepo.save(phones);
        PhoneDto phoneDto1=new PhoneDto(
                phones1.getId(),
                phones1.getName(),
                phones1.getModel(),
                phones1.getSize(),
                phones1.getColor(),
                phones1.getQuality(),
                phones1.getGb()
        );
        return phoneDto1;
    }

    @Override
    public PhoneDto getPhone(int id) {
        Phones phoneDto=phoneRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The phone id is not found :"+id));
        PhoneDto phoneDto1=new PhoneDto(
                phoneDto.getId(),
                phoneDto.getName(),
                phoneDto.getModel(),
                phoneDto.getSize(),
                phoneDto.getColor(),
                phoneDto.getQuality(),
                phoneDto.getGb()
        );
        return phoneDto1;
    }

    @Override
    public PhoneDto updatePhone(int id, PhoneDto phoneDto) {
        Phones phones=phoneRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The phone id is not found :"+id));
        phones.setName(phoneDto.getName());
        phones.setModel(phoneDto.getModel());
        phones.setSize(phoneDto.getSize());
        phones.setColor(phoneDto.getColor());
        phones.setQuality(phoneDto.getQuality());
        phones.setGb(phoneDto.getGb());

        Phones phone=phoneRepo.save(phones);

        PhoneDto phoneDto1=new PhoneDto(
                phone.getId(),
                phone.getName(),
                phone.getModel(),
                phone.getSize(),
                phone.getColor(),
                phone.getQuality(),
                phone.getGb()
        );
        return phoneDto1 ;
    }

    @Override
    public Phones deletePhone(int id) {
        Phones phones=phoneRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The phone id is not found :"+id));
        phoneRepo.deleteById(id);
        return phones;
    }
}
