package com.Exam.Exams.Services;

import com.Exam.Exams.Entity.ExamEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

public interface ExamServices {
    ExamEntity saveExam(MultipartFile exam, String name, Long govtnum, Long dob, Double yearpass, String center) throws SQLException, IOException;

}
