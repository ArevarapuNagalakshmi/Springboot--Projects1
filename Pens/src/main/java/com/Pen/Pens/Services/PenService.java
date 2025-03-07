package com.Pen.Pens.Services;

import com.Pen.Pens.Dto.PenDto;
import com.Pen.Pens.Entity.PenEntity;
import com.Pen.Pens.Repository.PenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenService implements PenServices {
    @Autowired
    private PenRepo penRepo;

    @Override
    public PenDto savePen(PenDto penDto) {
        PenEntity penEntity=new PenEntity(
                penDto.getId(),
                penDto.getName(),
                penDto.getColor(),
                penDto.getShape(),
                penDto.getGrip()
        );
        PenEntity penEntity1=penRepo.save(penEntity);
        PenDto penDto1=new PenDto(
                penEntity1.getId(),
                penEntity1.getName(),
                penEntity1.getColor(),
                penEntity1.getShape(),
                penEntity1.getGrip()
        );
        return penDto1;

    }

    @Override
    public PenDto getPen(int id) {
        PenEntity penEntity=penRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The pen is is not found :"+id));
        PenDto penDto=new PenDto(
                penEntity.getId(),
                penEntity.getName(),
                penEntity.getColor(),
                penEntity.getShape(),
                penEntity.getGrip()
        );
        return penDto;
    }

    @Override
    public PenDto updatePen(int id, PenDto penDto) {
        PenEntity penEntity=penRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The pen id is not found :"+id));
        penEntity.setName(penDto.getName());
        penEntity.setColor(penDto.getColor());
        penEntity.setShape(penDto.getShape());
        penEntity.setGrip(penDto.getGrip());
        PenEntity penEntity1=penRepo.save(penEntity);
        PenDto penDto1=new PenDto(
                penEntity1.getId(),
                penEntity.getName(),
                penEntity.getColor(),
                penEntity1.getShape(),
                penEntity1.getGrip()
        );
        return penDto1;
    }

    @Override
    public PenEntity deletePen(int id) {
        PenEntity penEntity=penRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The pen id is not found :"+id));
        penRepo.deleteById(id);
        return penEntity;
    }
}
