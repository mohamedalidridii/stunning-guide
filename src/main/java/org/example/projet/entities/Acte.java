package org.example.projet.entities;


import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

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

public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idActe;
    String codeActe;
    int cotationActe;
    String prixUnitaire;
    String designationActe;

    @ManyToMany()
    Set<Pathologie> pathologies= new HashSet<>();



}
