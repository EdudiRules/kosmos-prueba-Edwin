package com.pruebaEd.pruebaEd.dao;

import com.pruebaEd.pruebaEd.models.Consultorios;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ConsultorioDaoImpl implements ConsultorioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Consultorios> getConsultorios() {
        String query = "FROM Doctores";
        List<Consultorios> consultorios = entityManager.createQuery(query).getResultList();
        return consultorios;    }

    @Override
    public Consultorios getConsultorio() {
        return null;
    }
}
