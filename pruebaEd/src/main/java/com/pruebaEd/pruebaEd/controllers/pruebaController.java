package com.pruebaEd.pruebaEd.controllers;

import com.pruebaEd.pruebaEd.dao.CitasDao;
import com.pruebaEd.pruebaEd.dao.ConsultorioDao;
import com.pruebaEd.pruebaEd.models.Citas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class pruebaController {

    @Autowired
    private CitasDao citasDao;
    @Autowired
    private ConsultorioDao consultorioDao;

    @RequestMapping(value = "api/citas/{id}")
    public Citas getCita(@PathVariable Long id){
        Citas cita = citasDao.getCita(id);
        return cita;
    }

    @RequestMapping(value = "api/citas", method = RequestMethod.GET)
    public List<Citas> getCitas(){
        return citasDao.getCitas();
    }

    @RequestMapping(value = "api/citas/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
       citasDao.deleteCita(id);
    }

    @RequestMapping(value = "api/citas", method = RequestMethod.POST)
    public void registraCita(@RequestBody Citas cita){
         citasDao.registraCita(cita);
    }}
