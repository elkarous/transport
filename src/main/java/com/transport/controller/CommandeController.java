package com.transport.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.transport.enteties.*;
import com.transport.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/commande")
public class CommandeController {
    @Autowired
    CommandeService commandeService;



    @PostMapping
    public Commande addCommandeWithoutImage(@RequestBody Commande Commande)  {
        return commandeService.addCommande(Commande);
    }
    @GetMapping("/client/{id}")
    public List<Commande> getByClient(@PathVariable("id") long id)  {
        return commandeService.getCommandeByClient(id);
    }
    @GetMapping("/chauffeur/{id}")
    public List<Commande> getBychauffeur(@PathVariable("id") long id)  {
        return commandeService.getCommandeByChauffeur(id);
    }
    @GetMapping("/stat/{stat}")
    public List<Commande> getByStat(@PathVariable("stat") Stat stat)  {
        return commandeService.getCommandeByStat(stat);
    }
    @PutMapping
    public Commande updateCommandeWithoutImage(@RequestBody Commande CommandeDto) {
        return commandeService.updateCommande(CommandeDto);
    }

    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }


    @GetMapping("/{id}")
    public Commande getCommandeById(@PathVariable(name = "id") int id) {
        return commandeService.getCommandeById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteCommande(@PathVariable(name = "id") int id) {
        commandeService.deleteCommande(id);
    }

}
