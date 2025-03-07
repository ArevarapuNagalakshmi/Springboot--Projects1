package com.Phone.Phones.Services;

import com.Phone.Phones.Dto.PhoneDto;
import com.Phone.Phones.Entity.Phones;

public interface PhoneService{
    PhoneDto savePhone(PhoneDto phoneDto);
    PhoneDto getPhone(int id);
    PhoneDto updatePhone(int id,PhoneDto phoneDto);
    Phones deletePhone(int id);
}
