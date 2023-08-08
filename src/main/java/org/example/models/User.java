package org.example.models;

import static org.example.validations.UserValidation.*;

public class User {
    private Integer id;
    private String document;
    private String names;
    private String email;
    private Integer location;

    public User() {
    }

    public User(Integer id, String document, String names, String email, Integer location) {
        this.id = id;
        this.document = document;
        this.names = names;
        this.email = email;
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", document='" + document + '\'' +
                ", names='" + names + '\'' +
                ", email='" + email + '\'' +
                ", location=" + location +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        try{
            validateName(names);
            this.names = names;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try{
            validateEmail(email);
            this.email = email;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        try{
            validateLocationUser(location);
            this.location = location;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
