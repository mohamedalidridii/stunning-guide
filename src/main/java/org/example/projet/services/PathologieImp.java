package org.example.projet.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.projet.entities.Pathologie;
import org.example.projet.repositories.PathologieRepository;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@AllArgsConstructor
public class PathologieImp implements IPathologie {

    PathologieRepository pathologieRepository;

    public Pathologie ajouterPathologie(Pathologie path){
        return pathologieRepository.save(path);
    }
}
