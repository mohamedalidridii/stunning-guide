package org.example.projet.controllers;

import org.example.projet.entities.Animal;
import org.example.projet.services.IAnimal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animalController")


public class AnimalController {
    IAnimal animalService;
    @PostMapping("/addAnimal")
    public Animal addOrUpdateAnimal(@RequestBody Animal animal) {
        return animalService.addOrUpdateAnimal(animal);
    }
}
