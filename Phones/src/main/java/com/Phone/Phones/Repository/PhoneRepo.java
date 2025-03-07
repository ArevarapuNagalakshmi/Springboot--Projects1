package com.Phone.Phones.Repository;

import com.Phone.Phones.Entity.Phones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhoneRepo extends JpaRepository<Phones,Integer> {
    Optional<Phones>findById(int id);
}
