package com.Student1.demo.Service;

import com.Student1.demo.Dto.StudentDto;
import com.Student1.demo.Entity.Student;

public interface DemoStudent {
    StudentDto saveStudent(StudentDto studentDTO);

    StudentDto getStudentById(Long id);
    StudentDto updateStudent(Long id,StudentDto studentDto);
    Student deleteStudent(Long id);
}
