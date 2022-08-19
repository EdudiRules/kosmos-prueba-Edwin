package com.pruebaEd.pruebaEd.dao;

import com.pruebaEd.pruebaEd.models.Doctores;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class DoctoresDaoImpl implements DoctoresDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Doctores> getDoctores() {
        String query = "FROM doctores";
        List<Doctores> doctores = entityManager.createQuery(query).getResultList();
        return doctores;
    }

    @Override
    @Transactional
    public Doctores getDoctor(Long id) {
        String query = "FROM doctores WHERE NOMBRE = doc";
        Doctores doctor = entityManager.find(Doctores.class, id);
        return doctor;
    }
}
