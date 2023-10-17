package org.example.modeloDatos;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ModeloUsuarioInvitado {

    @Id
    @Column(name = "id_cedula")
    private String cedula;

    @Column(name = "fecha_invitacion")
    private LocalDate fechaInvitacion;

    @Column(name = "fecha_finalizacion")
    private LocalDate fechaFinalizacion;

    public ModeloUsuarioInvitado() {
    }

    public ModeloUsuarioInvitado(String cedula) {
        this.cedula = cedula;
        this.fechaInvitacion = LocalDate.now();
        this.fechaFinalizacion = fechaInvitacion.plusDays(5);
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaInvitacion() {
        return fechaInvitacion;
    }

    public void setFechaInvitacion(LocalDate fechaInvitacion) {
        this.fechaInvitacion = fechaInvitacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
