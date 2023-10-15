package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.UsuarioMembresia;
import org.example.modeloDatos.ModeloUsuario;
import org.example.modeloDatos.ModeloUsuarioMembresia;

import java.util.List;

public class ServicioUsuario {

    public void registrarUsuario(UsuarioMembresia usuarioMembresia){
        String configuracionPersistencia = "conexionBD";

        EntityManagerFactory entityManagerFactory = null;

        EntityManager entityManager = null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory(configuracionPersistencia);
            entityManager = entityManagerFactory.createEntityManager();

            ModeloUsuarioMembresia modeloUsuarioMembresia = new ModeloUsuarioMembresia();

            modeloUsuarioMembresia.setNombres(usuarioMembresia.getNombres());
            modeloUsuarioMembresia.setDocumento(usuarioMembresia.getDocumento());
            modeloUsuarioMembresia.setCorreo(usuarioMembresia.getCorreo());
            modeloUsuarioMembresia.setCostoMensual(usuarioMembresia.getCostoMensual());
            modeloUsuarioMembresia.setIdInvitado(usuarioMembresia.getIdInvitado());
            modeloUsuarioMembresia.setUbicacion(usuarioMembresia.getUbicacion());
            modeloUsuarioMembresia.setIdInvitado(usuarioMembresia.getIdInvitado());

            //Inicio de la transacción
            entityManager.getTransaction().begin();

            //Activar persistencia
            entityManager.persist(modeloUsuarioMembresia);

            //Registro de la operacion
            entityManager.getTransaction().commit();

            System.out.println("Exito en la transacción. Usuario registrado exitosamente");

        }catch (Exception error){
            System.out.println("Fallamos " + error.getMessage());
        }finally {
            if(entityManager != null){
                entityManager.close();
            }
            if(entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }


    }

    public List<ModeloUsuario> buscarUsuario(){
        return null;
    }





}
