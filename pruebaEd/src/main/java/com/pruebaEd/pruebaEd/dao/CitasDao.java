package com.pruebaEd.pruebaEd.dao;

import com.pruebaEd.pruebaEd.models.Citas;
import java.util.List;

public interface CitasDao {
    List<Citas> getCitas();

    Citas getCita(Long id);

    void deleteCita(Long id);

    void registraCita(Citas cita);
}
