package org.example.projet.services;

import lombok.AllArgsConstructor;
import org.example.projet.entities.FamilleActe;
import org.example.projet.repositories.FamilleActeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FamilleActeImp implements IFamilleActe {

    @Autowired
    FamilleActeRepository familleActeRepository;

    @Override
    public FamilleActe addOrUpdateAnimal(FamilleActe familleActe) {
        return familleActeRepository.save(familleActe);
    }

}
