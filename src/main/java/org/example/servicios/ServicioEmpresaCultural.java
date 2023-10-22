package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entidades.EmpresaCultural;
import org.example.modeloDatos.*;

import java.util.List;

public class ServicioEmpresaCultural {

    public void registrarEmpresa(EmpresaCultural empresaCultural){
        String configuracionPersistencia = "conexionBD";

        try (EntityManagerFactory entityManagerFactory =
                     Persistence.createEntityManagerFactory(configuracionPersistencia);
             EntityManager entityManager = entityManagerFactory.createEntityManager()) {

            ModeloEmpresaCultural modeloEmpresaCultural =
                    getModeloEmpresaCultural(empresaCultural);


            entityManager.getTransaction().begin();

            entityManager.persist(modeloEmpresaCultural);

            entityManager.getTransaction().commit();

            System.out.println("Exito en la transacción. empresa registrada exitosamente");

        } catch (Exception error) {
            System.out.println("Fallamos " + error.getMessage());
        }
    }

    private static ModeloEmpresaCultural getModeloEmpresaCultural(EmpresaCultural empresaCultural) {
        ModeloEmpresaCultural modeloEmpresaCultural = new ModeloEmpresaCultural();
        modeloEmpresaCultural.setFk(new ModeloEmpresa(
                empresaCultural.getNit(),
                empresaCultural.getNombre(),
                empresaCultural.getUbicacion(),
                empresaCultural.getDescripcion()
        ));

        modeloEmpresaCultural.setEntidad(empresaCultural.getEntidad());
        modeloEmpresaCultural.setEmailContacto(empresaCultural.getEmailContacto());
        modeloEmpresaCultural.setNumeroContacto(empresaCultural.getNumeroContacto());
        modeloEmpresaCultural.setMision(empresaCultural.getMision());


        return modeloEmpresaCultural;
    }

    public List<ModeloEmpresaCultural> buscarEmpresa(){
        String configuracionPersistencia = "conexionBD";

        try(EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory(configuracionPersistencia);
            EntityManager entityManager = entityManagerFactory.createEntityManager()){

            String jpqlConsulta = "SELECT empresa FROM ModeloEmpresaCultural empresa";

            //
            List<ModeloEmpresaCultural> empresasBD =
                    entityManager.createQuery(jpqlConsulta, ModeloEmpresaCultural.class).getResultList();

            //Retornar

            return empresasBD;


        }catch (Exception e){
            System.out.println("Fallamos " + e.getMessage());
            return null;
        }
    }


}