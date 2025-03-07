package com.Pen.Pens.Repository;

import com.Pen.Pens.Entity.PenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PenRepo extends JpaRepository<PenEntity,Integer>{
    Optional<PenEntity>findById(int id);

}
