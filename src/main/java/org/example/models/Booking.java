package org.example.models;

import java.time.LocalDate;

public class Booking {
    private Integer id;
    private Integer idUser;
    private Integer IdOffer;
    private Double costTotal;
    private LocalDate dateBooking;

    public Booking() {
    }

    public Booking(Integer id, Integer idUser, Integer idOffer, Double costTotal, LocalDate dateBooking) {
        this.id = id;
        this.idUser = idUser;
        IdOffer = idOffer;
        this.costTotal = costTotal;
        this.dateBooking = dateBooking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", IdOffer=" + IdOffer +
                ", costTotal=" + costTotal +
                ", dateBooking=" + dateBooking +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdOffer() {
        return IdOffer;
    }

    public void setIdOffer(Integer idOffer) {
        IdOffer = idOffer;
    }

    public Double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(Double costTotal) {
        this.costTotal = costTotal;
    }

    public LocalDate getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(LocalDate dateBooking) {
        this.dateBooking = dateBooking;
    }
}
