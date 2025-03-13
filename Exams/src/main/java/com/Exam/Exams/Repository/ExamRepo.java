package com.Exam.Exams.Repository;

import com.Exam.Exams.Entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepo extends JpaRepository<ExamEntity,Integer> {
    ExamEntity findById(int id);
}
