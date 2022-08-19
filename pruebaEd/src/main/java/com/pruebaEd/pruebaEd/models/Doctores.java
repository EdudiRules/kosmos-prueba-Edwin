package com.pruebaEd.pruebaEd.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctores")
public class Doctores {

    @Id
    @Getter @Setter @Column (name = "ID")
    private Long id;
    @Getter @Setter @Column (name = "NOMBRE")
    private String nombre;
    @Getter @Setter @Column (name = "APELLIDOP")
    private String apellidoP;
    @Getter @Setter @Column (name = "APELLIDOM")
    private String apellidoM;
    @Getter @Setter @Column (name = "ESPECIALIDAD")
    private String especialidad;

}
