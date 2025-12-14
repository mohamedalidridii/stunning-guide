package org.example.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPatient;

    @Enumerated(EnumType.STRING)
    TypePieceIdentite TypePieceIdentite;

    String IdentifiantPieceIdentite;
    Date dateEmission;
    String nomP;
    String prenom;


    @ManyToMany()
    Set<Pathologie> pathologies= new HashSet<>();

}
