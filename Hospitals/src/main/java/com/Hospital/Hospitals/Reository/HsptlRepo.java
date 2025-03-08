package com.Hospital.Hospitals.Reository;

import com.Hospital.Hospitals.Entity.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HsptlRepo extends JpaRepository<Hospitals,Integer> {
    Optional<Hospitals> findById(int id);
}
