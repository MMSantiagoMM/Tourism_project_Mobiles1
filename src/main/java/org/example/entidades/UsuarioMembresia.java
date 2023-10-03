package org.example.entidades;

import org.example.entidades.interfaces.IAnalitica;
import org.example.entidades.interfaces.IReporte;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica<UsuarioMembresia> {

    private Double costoMensual;

    private Integer cedulaInvitado;


    public UsuarioMembresia() {
    }

    public UsuarioMembresia(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoMensual, Integer cedulaInvitado) {
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

    public void agregarInvitado(Integer cedulaInvitado){}

    @Override
    public void generarReporte(String datos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

    @Override
    public void editarReporte(Integer id) {

    }

    @Override
    public void limpiarDatos(UsuarioMembresia datos) {

    }

    @Override
    public void calcularDispersion(UsuarioMembresia datos) {

    }
}
