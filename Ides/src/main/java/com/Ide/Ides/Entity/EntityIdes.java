package com.Ide.Ides.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class EntityIdes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String tools;
    private String versions;

    @Lob
    private byte[] photo;

    public EntityIdes(int id, String name, String tools, String versions, Byte photo) {
        this.id = id;
        this.name = name;
        this.tools = tools;
        this.versions = versions;
        this.photo = new byte[0];
    }

    public EntityIdes(String name, String tools, String versions, Byte photo) {
        this.name = name;
        this.tools = tools;
        this.versions = versions;
        this.photo = new byte[0];
    }
    public EntityIdes(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTools(String tools) {
        return this.tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        EntityIdes that = (EntityIdes) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(tools, that.tools) && Objects.equals(versions, that.versions) && Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tools, versions, photo);
    }

    @Override
    public String toString() {
        return "EntityIdes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tools='" + tools + '\'' +
                ", versions='" + versions + '\'' +
                ", photo=" + photo +
                '}';
    }
}
