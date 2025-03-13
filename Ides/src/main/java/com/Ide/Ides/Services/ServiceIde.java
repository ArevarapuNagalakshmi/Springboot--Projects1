package com.Ide.Ides.Services;

import com.Ide.Ides.Entity.EntityIdes;
import com.Ide.Ides.Repository.RepoIde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

@Service
public class ServiceIde implements ServiceIdes{
    @Autowired
    private RepoIde repoIde;


    public EntityIdes saveIdes(MultipartFile ides, String name, String tools, String versions) throws  SQLException, IOException {
        EntityIdes entityIdes=new EntityIdes();
        entityIdes.setName(name);
        entityIdes.setTools(tools);
        entityIdes.setVersions(versions);

        if (!ides.isEmpty()){
            byte[] photoByte=ides.getBytes();
           // Blob photoBlob=new SerialBlob(photoByte);
            entityIdes.setPhoto(photoByte);
        }
        return repoIde.save(entityIdes);
    } @Override
    public EntityIdes getDoctors(int id) {

        return repoIde.findById(id);
    }
    public EntityIdes updateIdes(int id, String name, String tools, byte[] photo) {

     EntityIdes entityIdes =repoIde.findById(id);
        if (name != null) entityIdes.setName(name);
        if (tools != null) entityIdes.getTools(tools);
        if (photo != null && photo.length > 0) {
            byte[] photo1 = new byte[0];
            entityIdes.setPhoto(photo1);
        }

        return repoIde.save(entityIdes);
    }
    public void deleteIdes(int id) {
        EntityIdes entityIdes=repoIde.findById(id); // Assuming findById returns null if not found
        if (entityIdes != null) {
            repoIde.deleteById(id);
        } else {
            throw new RuntimeException("Exam not found with id: " + id);
        }
    }

}
