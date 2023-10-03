package org.example.modeloDatos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioMembresia extends ModeloUsuario {

    @Column(name = "costoMensual",nullable = false)
    private Double costoMensual;


    @Column(name = "cedulaInvitado",nullable = false)
    private Integer cedulaInvitado;

    public ModeloUsuarioMembresia() {
    }

    public ModeloUsuarioMembresia(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoMensual, Integer cedulaInvitado) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoMensual = costoMensual;
        this.cedulaInvitado = cedulaInvitado;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public Integer getCedulaInvitado() {
        return cedulaInvitado;
    }

    public void setCedulaInvitado(Integer cedulaInvitado) {
        this.cedulaInvitado = cedulaInvitado;
    }
}
