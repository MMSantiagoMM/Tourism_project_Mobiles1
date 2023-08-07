package org.example.modelos;

import org.example.Utilidades.Fechas;
import org.example.validaciones.ValidacionOferta;

import java.time.LocalDate;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private Double costoPersona;
    private Integer idLocal;
    ValidacionOferta validateOffer = new ValidacionOferta();
    Fechas formato = new Fechas();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, String fechaInicio, String fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;

    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoPersona=" + costoPersona +
                ", idLocal=" + idLocal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            this.validateOffer.validarTituloOferta(titulo);
            this.titulo = titulo;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        try{
            return this.formato.convertirFechas(this.fechaInicio);
        }catch (Exception e){
            System.out.println(e.getMessage() + "Formato de fecha no válido");
        }
        return null;
    }

    public void setFechaInicio(String fechaInicio) {

        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        this.costoPersona = costoPersona;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
