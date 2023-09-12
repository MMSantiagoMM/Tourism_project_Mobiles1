package org.example.modelos;

public class EmpresaPrivada extends Empresa {

    private String representanteLegal;


    public EmpresaPrivada() {
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String representanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.representanteLegal = representanteLegal;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public Double calcularCobro(Double costo){
        return costo + (costo * 0.19);
    }



}
