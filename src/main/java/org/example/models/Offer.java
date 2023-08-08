package org.example.models;

import static org.example.validations.OfferValidation.*;

import java.time.LocalDate;

public class Offer {
    private Integer id;
    private String title;
    private String description;
    private LocalDate dateBegining;
    private LocalDate dateLast;
    private Double costPerson;
    private Integer idStablishment;

    public Offer() {
    }

    public Offer(Integer id, String title, String description, LocalDate dateBegining, LocalDate dateLast, Double costPerson, Integer idStablishment) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateBegining = dateBegining;
        this.dateLast = dateLast;
        this.costPerson = costPerson;
        this.idStablishment = idStablishment;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateBegining=" + dateBegining +
                ", dateLast=" + dateLast +
                ", costPerson=" + costPerson +
                ", idStablishment=" + idStablishment +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        try{
            validateTitle(title);
            this.title = title;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateBegining() {
        return dateBegining;
    }

    public void setDateBegining(String dateBegining) {
        try{
            LocalDate newFormat = validateFormat(dateBegining);
            this.dateBegining = newFormat;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public LocalDate getDateLast() {
        return dateLast;
    }

    public void setDateLast(String dateLast) {
        try{
            LocalDate newFormat = validateFormat(dateLast);
            validateDatesBeginingAndLast(this.dateBegining,newFormat);
            this.dateLast = newFormat;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Double getCostPerson() {
        return costPerson;
    }

    public void setCostPerson(Double costPerson) {
        try{
            validateCostPerson(costPerson);
            this.costPerson = costPerson;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Integer getIdStablishment() {
        return idStablishment;
    }

    public void setIdStablishment(Integer idStablishment) {
        this.idStablishment = idStablishment;
    }
}
