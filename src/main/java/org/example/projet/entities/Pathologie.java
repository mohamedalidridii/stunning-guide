package org.example.projet.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class Pathologie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPath;
    String codePath;
    String libelle;
    String description;
    Boolean archive = false;

}
