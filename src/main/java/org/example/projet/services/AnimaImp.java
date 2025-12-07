package org.example.projet.services;

import lombok.AllArgsConstructor;
import org.example.projet.entities.Animal;
import org.example.projet.entities.DemandeDadoption;
import org.example.projet.repositories.AnimalRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AnimaImp implements IAnimal {
    AnimalRepository  animalRepository;

    @Override
    public Animal addOrUpdateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

}
