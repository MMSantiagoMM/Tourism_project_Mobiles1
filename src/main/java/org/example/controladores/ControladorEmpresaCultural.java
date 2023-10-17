package org.example.controladores;

import org.example.entidades.EmpresaCultural;
import org.example.modeloDatos.ModeloEmpresaCultural;
import org.example.modeloDatos.ModeloUsuarioXEvento;
import org.example.servicios.ServicioEmpresaCultural;

import java.util.List;

public class ControladorEmpresaCultural {

    EmpresaCultural empresaCultural = new EmpresaCultural();
    ServicioEmpresaCultural servicioEmpresaCultural = new ServicioEmpresaCultural();


    public void agregarEmpresa(String nit,String nombre, String ubicacion,
                               String descripcion, String entidad, String emailContacto,
                               String numeroContacto, String mision){

        this.empresaCultural.setNit(nit);
        this.empresaCultural.setNombre(nombre);
        this.empresaCultural.setUbicacion(Integer.valueOf(ubicacion));
        this.empresaCultural.setDescripcion(descripcion);
        this.empresaCultural.setEntidad(entidad);
        this.empresaCultural.setEmailContacto(emailContacto);
        this.empresaCultural.setNumeroContacto(numeroContacto);
        this.empresaCultural.setMision(mision);
        this.servicioEmpresaCultural.registrarEmpresa(empresaCultural);


    }

    public void consultarEmpresa(){
        List<ModeloEmpresaCultural> empresas = servicioEmpresaCultural.buscarEmpresa();

        for (ModeloEmpresaCultural modeloEmpresaCultural:empresas) {
            System.out.println("Nombre: " + modeloEmpresaCultural.getFk().getNombre());
        }

    }



}
