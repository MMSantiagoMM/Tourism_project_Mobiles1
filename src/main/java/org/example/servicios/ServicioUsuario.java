package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.UsuarioMembresia;
import org.example.modeloDatos.ModeloUsuario;
import org.example.modeloDatos.ModeloUsuarioMembresia;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public class ServicioUsuario {

    public void registrarUsuario(UsuarioMembresia usuarioMembresia){
        String configuracionPersistencia = "conexionBD";

        try (EntityManagerFactory entityManagerFactory =
                     Persistence.createEntityManagerFactory(configuracionPersistencia);
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {

            ModeloUsuarioMembresia modeloUsuarioMembresia =
                    getModeloUsuarioMembresia(usuarioMembresia);


            //Inicio de la transacción
            entityManager.getTransaction().begin();

            //Activar persistencia
            //entityManager.persist(modeloUsuario);
            entityManager.persist(modeloUsuarioMembresia);

            //Registro de la operacion
            entityManager.getTransaction().commit();

            System.out.println("Exito en la transacción. Usuario registrado exitosamente");

        } catch (Exception error) {
            System.out.println("Fallamos " + error.getMessage());
        }
    }

    private static ModeloUsuarioMembresia getModeloUsuarioMembresia(UsuarioMembresia usuarioMembresia) {
        ModeloUsuarioMembresia modeloUsuarioMembresia = new ModeloUsuarioMembresia();

        modeloUsuarioMembresia.setModeloUsuario(new ModeloUsuario(
                usuarioMembresia.getDocumento(),usuarioMembresia.getNombres(),
                usuarioMembresia.getCorreo(), usuarioMembresia.getUbicacion()
        ));

        modeloUsuarioMembresia.setCostoMensual(usuarioMembresia.getCostoMensual());
        modeloUsuarioMembresia.setIdInvitado(usuarioMembresia.getIdInvitado());
        return modeloUsuarioMembresia;
    }

    public List<ModeloUsuarioMembresia> buscarUsuario(){
        String configuracionPersistencia = "conexionBD";

        try(EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory(configuracionPersistencia);
            EntityManager entityManager = entityManagerFactory.createEntityManager()){


            //Establecer consulta para traer datos de la BD


            String jpqlConsulta = "SELECT usuario FROM ModeloUsuarioMembresia usuario";

            //
            List<ModeloUsuarioMembresia> usuariosBD =
                    entityManager.createQuery(jpqlConsulta, ModeloUsuarioMembresia.class).getResultList();

            //Retornar

            return usuariosBD;


        }catch (Exception e){
            System.out.println("Fallamos " + e.getMessage());
            return null;
        }
    }
}
