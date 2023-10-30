/*package com.martin.apidistribuidorapedidos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "productos", cascade = CascadeType.ALL)
    private Set<ListaDePrecios> listasDePrecios;
}
*/