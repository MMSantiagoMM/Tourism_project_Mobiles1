package org.example.modeloDatos;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class ModeloUsuarioMembresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "costoMensual")
    private Double costoMensual;


    @Column(name = "idInvitado")
    private Integer idInvitado;


    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_usuario")
    private ModeloUsuario modeloUsuario;

*/
    @OneToOne
    @MapsId
    private ModeloUsuario modeloUsuario;

    @OneToOne
    private ModeloUsuarioInvitado modeloUsuarioInvitado;



    public ModeloUsuarioMembresia() {
    }

    public ModeloUsuarioMembresia(Double costoMensual, Integer idInvitado, ModeloUsuario modeloUsuario) {

        this.costoMensual = costoMensual;
        this.idInvitado = idInvitado;
        this.modeloUsuario = modeloUsuario;

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

    public void setIdInvitado(Integer idInvitado) {
        this.idInvitado = idInvitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ModeloUsuario getModeloUsuario() {
        return modeloUsuario;
    }

    public void setModeloUsuario(ModeloUsuario modeloUsuario) {
        this.modeloUsuario = modeloUsuario;
    }

    public void setModeloUsuario(Integer id) {
    }
}
