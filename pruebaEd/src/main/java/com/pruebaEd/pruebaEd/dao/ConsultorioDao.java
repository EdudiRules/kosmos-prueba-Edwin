package com.pruebaEd.pruebaEd.dao;

import com.pruebaEd.pruebaEd.models.Consultorios;
import java.util.List;

public interface ConsultorioDao {

    List<Consultorios> getConsultorios();

    Consultorios getConsultorio();
}
