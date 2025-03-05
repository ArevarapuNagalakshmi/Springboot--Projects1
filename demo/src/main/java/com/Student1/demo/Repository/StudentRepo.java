package com.Student1.demo.Repository;

import com.Student1.demo.Dto.StudentDto;
import com.Student1.demo.Entity.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo<studentDto> extends JpaRepository<Student,Long> {
     Student findByid(Long id);

}
