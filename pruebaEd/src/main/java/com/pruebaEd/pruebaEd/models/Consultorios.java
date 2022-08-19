package com.pruebaEd.pruebaEd.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consultorios")
public class Consultorios {

    @Id
    @Getter @Setter @Column(name = "ID")
    private Long id;
    @Getter @Setter @Column(name = "PISO")
    private Long piso;
}
