package com.Ide.Ides.Dto;

import com.Ide.Ides.Entity.EntityIdes;
import jakarta.persistence.Lob;
import org.apache.tomcat.util.codec.binary.Base64;

import java.sql.Blob;
import java.util.List;
import java.util.Objects;

import static org.apache.tomcat.util.codec.binary.Base64.encodeBase64String;

public class IdeDto {
    private int id;
    private String name;
    private String tools;
    private String versions;

    @Lob
    private Byte photo;

    public IdeDto(int id, String name, String tools, String versions, Byte photo) {
        this.id = id;
        this.name = name;
        this.tools = tools;
        this.versions = versions;
        this.photo = photo;
    }

    public IdeDto(String name, String tools, String versions, Byte photo) {
        this.name = name;
        this.tools = tools;
        this.versions = versions;
        this.photo = photo;
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

    public String getTools() {
        return tools;
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

    public Byte getPhoto() {
        return photo;
    }

    public void setPhoto(Byte photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IdeDto ideDto = (IdeDto) o;
        return id == ideDto.id && Objects.equals(name, ideDto.name) && Objects.equals(tools, ideDto.tools) && Objects.equals(versions, ideDto.versions) && Objects.equals(photo, ideDto.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tools, versions, photo);
    }

    @Override
    public String toString() {
        return "IdeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tools='" + tools + '\'' +
                ", versions='" + versions + '\'' +
                ", photo=" + photo +
                '}';
    }
}

