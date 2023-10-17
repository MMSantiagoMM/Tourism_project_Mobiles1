package org.example.modeloDatos;


import jakarta.persistence.*;

@Entity
public class ModeloUsuarioXEvento{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "costo_evento")
    private Double costoPorEvento;

    public ModeloUsuarioXEvento() {
    }

    public ModeloUsuarioXEvento(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }

    public Double getCostoPorEvento() {
        return costoPorEvento;
    }

    public void setCostoPorEvento(Double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }
}
