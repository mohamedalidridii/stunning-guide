package org.example.projet.controllers;

import org.example.projet.entities.FamilleActe;
import org.example.projet.services.IFamilleActe;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/familleActeController")


public class FamilleActeController {
    IFamilleActe animalService;
    @PostMapping("/addAnimal")
    public FamilleActe addOrUpdateAnimal(@RequestBody FamilleActe familleActe) {
        return animalService.addOrUpdateAnimal(familleActe);
    }
}
