package org.example.projet.entities;


import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.engine.spi.CascadeStyle;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class DemandeDadoption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAdoption;
    String code;
    LocalDate dateDemande;
    String commentaire;
    StatusAdoption status;


    @ManyToMany(mappedBy ="demandes")
    Set<Animal> animals = new HashSet<>()  ;

    @ManyToOne(cascade = CascadeType.ALL)
    private Utilisateur utilisateur;


}
