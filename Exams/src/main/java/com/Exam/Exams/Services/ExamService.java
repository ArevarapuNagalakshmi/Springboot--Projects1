package com.Exam.Exams.Services;

import com.Exam.Exams.Entity.ExamEntity;
import com.Exam.Exams.Repository.ExamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Optional;

@Service
public class ExamService implements ExamServices{
    @Autowired
    private ExamRepo examRepo;




    public ExamEntity saveExam(MultipartFile exam, String name, Long govtnum ,Long dob, Double yearpass, String center) throws IOException, SQLException {
        ExamEntity examEntity=new ExamEntity();
        examEntity.setName(name);
        examEntity.setGovtnum(govtnum);
        examEntity.setDob(dob);
        examEntity.setYearpass(yearpass);
        examEntity.setCenter(center);
        if (!exam.isEmpty()){
            byte[] photoBytes = exam.getBytes();
            Blob photoBlob = new SerialBlob(photoBytes);
            examEntity.setPhotopic(photoBytes);
        }
        return examRepo.save(examEntity);
    }
    public ExamEntity getExam(int id){
        return examRepo.findById(id);
    }
    public ExamEntity updateDoctors(int id, String name, Long dob, byte[] photopic) {

        ExamEntity examEntity=examRepo.findById(id);
        if (name != null) examEntity.setName(name);
        if (dob != null) examEntity.setDob(dob);
        if (photopic != null && photopic.length > 0) {
            byte[] photo1 = new byte[0];
            examEntity.setPhotopic(photo1);
        }

        return examRepo.save(examEntity);
    }
    public void deleteExam(int id) {
        ExamEntity examEntity = examRepo.findById(id); // Assuming findById returns null if not found
        if (examEntity != null) {
            examRepo.deleteById(id);
        } else {
            throw new RuntimeException("Exam not found with id: " + id);
        }
    }



}
