package org.example.models;

import static org.example.validations.StablishmentValidation.*;

public class Stablishment {
    private Integer id;
    private String nit;
    private String name;
    private Integer location;
    private String description;

    public Stablishment() {
    }

    public Stablishment(Integer id, String nit, String name, Integer location, String description) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.location = location;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Stablishment{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
            validateNit(nit);
            this.nit = nit;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try{
            validateName(name);
            this.name = name;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
