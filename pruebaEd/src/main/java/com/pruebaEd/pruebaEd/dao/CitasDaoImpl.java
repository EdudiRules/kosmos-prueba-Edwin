package com.pruebaEd.pruebaEd.dao;

import com.pruebaEd.pruebaEd.models.Citas;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CitasDaoImpl implements CitasDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Citas> getCitas() {
        String query = "FROM Citas";
        List<Citas> citas = entityManager.createQuery(query).getResultList();
        return citas;
    }

    @Override
    public Citas getCita(Long id) {
        Citas cita = entityManager.find(Citas.class, id);
        return cita;
    }

    @Override
    public void deleteCita(Long id) {
        Citas cita = entityManager.find(Citas.class, id);
        entityManager.remove(cita);
    }

    @Override
    public void registraCita(Citas cita) {
        entityManager.merge(cita);
    }
}
