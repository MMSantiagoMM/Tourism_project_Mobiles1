package org.example.modeloDatos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloEmpresaCultural extends ModeloEmpresa{

    @Column(name = "entidad",nullable = false)
    private String entidad;

    @Column(name = "mision",nullable = false)
    private String mision;

    @Column(name = "email_contacto")
    private String emailContacto;

    @Column(name = "numero_contacto")
    private String numeroContacto;

    public ModeloEmpresaCultural() {
    }

    public ModeloEmpresaCultural(Integer id, String nit, String nombre, Integer ubicacion,
                                 String descripcion, String entidad, String mision, String emailContacto, String numeroContacto) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.entidad = entidad;
        this.mision = mision;
        this.emailContacto = emailContacto;
        this.numeroContacto = numeroContacto;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
