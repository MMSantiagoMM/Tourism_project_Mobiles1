package org.example.modeloDatos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeloUsuarioXEvento extends ModeloUsuario{


    @Column(name = "costo_evento")
    private Double costoPorEvento;

    public ModeloUsuarioXEvento() {
    }

    public ModeloUsuarioXEvento(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoPorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoPorEvento = costoPorEvento;
    }

    public Double getCostoPorEvento() {
        return costoPorEvento;
    }

    public void setCostoPorEvento(Double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }
}
