package com.Pen.Pens.Controllers;

import com.Pen.Pens.Dto.PenDto;
import com.Pen.Pens.Entity.PenEntity;
import com.Pen.Pens.Services.PenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pens")
public class Controller {
    @Autowired
    private PenService penService;

    @PostMapping("/savepen")
    public ResponseEntity<PenDto>savePen(@RequestBody PenDto penDto){
        PenDto penDto1=penService.savePen(penDto);
        return new ResponseEntity<>(penDto1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PenDto>getPen(@PathVariable int id){
        PenDto penDto=penService.getPen(id);
        return new ResponseEntity<>(penDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PenDto>updatePen(@PathVariable int id,
                                           @RequestBody PenDto penDto){
        PenDto penDto1=penService.updatePen(id,penDto);
        return new ResponseEntity<>(penDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<PenEntity>deletePen(@PathVariable int id){
        PenEntity penEntity=penService.deletePen(id);
        return new ResponseEntity<>(penEntity,HttpStatus.OK);
    }


}
