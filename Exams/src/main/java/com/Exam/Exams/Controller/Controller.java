package com.Exam.Exams.Controller;

import com.Exam.Exams.Dto.ExamDto;
import com.Exam.Exams.Entity.ExamEntity;
import com.Exam.Exams.Services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

@RestController
@RequestMapping("/exams")
public class Controller {
    @Autowired
    private ExamService examService;

    @PostMapping(value = "/saveexam", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExamEntity> saveExam(
            @RequestParam("photopic") MultipartFile photopic,
            @RequestParam("name") String name,
            @RequestParam("govtnum") Long govtnum,
            @RequestParam("dob") Long dob,
            @RequestParam("yearpass") Double yearpass,
            @RequestParam("center") String center) throws SQLException, IOException {

        ExamEntity examEntity = examService.saveExam(photopic, name, govtnum, dob, yearpass, center);

        return new ResponseEntity<>(examEntity, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ExamEntity>getExam(@PathVariable int id) throws SQLException,IOException{
      ExamEntity examEntity=examService.getExam(id);
        return new ResponseEntity<>(examEntity,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ExamEntity> updateDoctors(
            @PathVariable int id,
            @RequestParam(value = "photopic", required = false) MultipartFile photopic,
            @RequestParam("name") String name,
            @RequestParam("dob") Long dob) throws IOException {

        byte[] photoBytes = (photopic != null && !photopic.isEmpty()) ? photopic.getBytes() : null;

        ExamEntity examEntity= examService.updateDoctors(id, name, dob, photoBytes);

        return ResponseEntity.ok(examEntity);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ExamEntity> deleteExam(@PathVariable int id){
        examService.deleteExam(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
