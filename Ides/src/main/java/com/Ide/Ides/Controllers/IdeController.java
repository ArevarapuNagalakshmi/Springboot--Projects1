package com.Ide.Ides.Controllers;

import com.Ide.Ides.Entity.EntityIdes;
import com.Ide.Ides.Services.ServiceIde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

@RestController
@RequestMapping("/ides")
public class IdeController {
    @Autowired
    private ServiceIde serviceIde;

    @PostMapping("saveide")
    public ResponseEntity<EntityIdes>saveIdes(@RequestParam("photo") MultipartFile photo,
                                              @RequestParam("name") String name,
                                              @RequestParam("tools") String tools,
                                              @RequestParam("versions") String versions) throws SQLException, IOException {
        EntityIdes entityIdes=serviceIde.saveIdes(photo,name,tools,versions);

        return new ResponseEntity<>(entityIdes, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EntityIdes>getDoctors(@PathVariable int id) throws SQLException,IOException{
        EntityIdes entityIdes=serviceIde.getDoctors(id);
        return new ResponseEntity<>(entityIdes,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntityIdes> updateIdes(
            @PathVariable int id,
            @RequestParam(value = "photo", required = false) MultipartFile photo,
            @RequestParam("name") String name,
            @RequestParam("tools") String tools) throws IOException {

        byte[] photoBytes = (photo != null && !photo.isEmpty()) ? photo.getBytes() : null;

        EntityIdes entityIdes = serviceIde.updateIdes(id, name, tools, photoBytes);

        return  new ResponseEntity<>(entityIdes,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<EntityIdes> deleteIdes(@PathVariable int id){
        serviceIde.deleteIdes(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
