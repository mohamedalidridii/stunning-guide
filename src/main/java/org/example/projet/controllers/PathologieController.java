package org.example.projet.controllers;

import lombok.AllArgsConstructor;
import org.example.projet.entities.Pathologie;
import org.example.projet.services.IPathologie;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathologieController")
@AllArgsConstructor

public class PathologieController {
    IPathologie pathologieService;

    @PostMapping("/addPath")
    Pathologie addPathologie(@RequestBody Pathologie path){
        return pathologieService.ajouterPathologie(path);
    }


}
