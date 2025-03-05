package com.Student1.demo.Controller;

import com.Student1.demo.Dto.StudentDto;
import com.Student1.demo.Entity.Student;
import com.Student1.demo.Service.DemoStudent;
import com.Student1.demo.Service.Impls.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class DemoController {

    @Autowired
    private DemoStudent student;

    @PostMapping("/savestudent")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto){
        StudentDto postStudent=student.saveStudent(studentDto);
        return new ResponseEntity<>(postStudent,HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable Long id){
        StudentDto students= student.getStudentById(id);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto>updtaeStudent(
            @PathVariable Long id,
            @RequestBody StudentDto studentDto){
          StudentDto updateStudent=student.updateStudent(id,studentDto);
        return new ResponseEntity<>(updateStudent,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Student>deleteStudent(@PathVariable long id){
        Student student1=student.deleteStudent(id);
        return new ResponseEntity<>(student1,HttpStatus.OK);
    }

}
