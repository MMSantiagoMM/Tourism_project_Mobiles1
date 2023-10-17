package org.example.entidades;

import org.example.entidades.interfaces.IAnalitica;
import org.example.entidades.interfaces.IReporte;

import java.time.LocalDate;

public class UsuarioMembresia extends Usuario implements IReporte, IAnalitica<UsuarioMembresia> {

    private Double costoMensual;
    private Integer cedulaInvitado;



    public UsuarioMembresia() {
    }

    public UsuarioMembresia(Integer id, String documento, String nombres,
                            String correo, Integer ubicacion, Double costoMensual,
                            Integer cedulaInvitado) {
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

    public UsuarioInvitado agregarReferido(String cedula){
        UsuarioInvitado usuarioInvitado = new UsuarioInvitado();
        usuarioInvitado.setCedula(cedula);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFinal = fechaActual.plusDays(5);
        usuarioInvitado.setFechaInvitacion(fechaActual);
        usuarioInvitado.setFechaFinalizacion(fechaFinal);
        return usuarioInvitado;
    }



}
