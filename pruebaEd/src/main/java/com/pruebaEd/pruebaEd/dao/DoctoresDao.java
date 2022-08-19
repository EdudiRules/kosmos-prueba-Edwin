package com.pruebaEd.pruebaEd.dao;

import com.pruebaEd.pruebaEd.models.Doctores;
import java.util.List;

public interface DoctoresDao {

    List<Doctores> getDoctores();

    Doctores getDoctor(Long doc);

}
