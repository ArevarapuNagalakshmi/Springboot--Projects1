package com.Ide.Ides.Repository;

import com.Ide.Ides.Entity.EntityIdes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoIde extends JpaRepository<EntityIdes,Integer>{
    EntityIdes findById(int id);
}
