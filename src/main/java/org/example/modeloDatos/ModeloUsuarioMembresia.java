package org.example.modeloDatos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioMembresia extends ModeloUsuario {

    @Column(name = "costoMensual",nullable = false)
    private Double costoMensual;


    @Column(name = "idInvitado",nullable = false)
    private Integer idInvitado;

    public ModeloUsuarioMembresia() {
    }

    public ModeloUsuarioMembresia(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoMensual, Integer idInvitado) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoMensual = costoMensual;
        this.idInvitado = idInvitado;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public Integer getIdInvitado() {
        return idInvitado;
    }

    public void setIdInvitado(Integer cedulaInvitado) {
        this.idInvitado = idInvitado;
    }
}
