package com.pruebaEd.pruebaEd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Citas {

    @Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "ID")
    private Long id;
    @Getter @Setter @Column(name = "CONSULTORIO")
    private Long consultorio;
    @Getter @Setter @Column(name = "DOCTOR")
    private String doctor;
    @Getter @Setter @Column(name = "HORARIO")
    private String horario;
    @Getter @Setter @Column(name = "PACIENTE")
    private String paciente;


}
