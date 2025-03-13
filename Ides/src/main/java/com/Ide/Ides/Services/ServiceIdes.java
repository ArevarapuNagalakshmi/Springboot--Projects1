package com.Ide.Ides.Services;

import com.Ide.Ides.Dto.IdeDto;
import com.Ide.Ides.Entity.EntityIdes;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;

public interface ServiceIdes {

    EntityIdes getDoctors(int id);

    EntityIdes updateIdes(int id, String name, String tools, byte[] photo);
}
