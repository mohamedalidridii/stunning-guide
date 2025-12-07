package org.example.projet.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAnimal;
    String nom;
    String espece;
    Etat etat;

    @ManyToMany()
    Set<DemandeDadoption> demandes = new HashSet<>() ;

}
