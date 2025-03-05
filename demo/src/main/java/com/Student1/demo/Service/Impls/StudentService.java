package com.Student1.demo.Service.Impls;

import com.Student1.demo.Dto.StudentDto;
import com.Student1.demo.Entity.Student;
import com.Student1.demo.Repository.StudentRepo;
import com.Student1.demo.Service.DemoStudent;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService  implements DemoStudent {

    @Autowired
    private StudentRepo studentrep;

    @Override
    public StudentDto saveStudent(StudentDto studentDTO) {

        Student student = new Student(
                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getMarks(),
                studentDTO.getBranch()

        );
        Student savestudent = (Student) studentrep.save(student);

        StudentDto studentDto = new StudentDto(
                savestudent.getId(),
                savestudent.getName(),
                savestudent.getMarks(),
                savestudent.getBranch()
        );

        return studentDto;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student getStudent = studentrep.findByid(id);
        StudentDto s1 = new StudentDto(
                getStudent.getId(),
                getStudent.getName(),
                getStudent.getMarks(),
                getStudent.getBranch()
        );

        return s1;
    }

    @Override
    public StudentDto updateStudent(Long id, StudentDto studentDto) {
        Student student = studentrep.findByid((id));
        student.setMarks(studentDto.getMarks());
        student.setBranch(studentDto.getBranch());

        Student updateStudent= (Student) studentrep.save(student);

        return new StudentDto(
                updateStudent.getId(),
                updateStudent.getName(),
                updateStudent.getMarks(),
                updateStudent.getBranch()
        );
    }

    @Override
    public Student deleteStudent(Long id) {
        Student student=studentrep.findByid(id);
        studentrep.deleteById(id);
        return student;
    }

}



