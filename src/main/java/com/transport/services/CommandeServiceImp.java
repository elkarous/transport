package com.transport.services;

import com.transport.enteties.*;
import com.transport.repositories.CommandeRepository;
import com.transport.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommandeServiceImp implements CommandeService {
    @Autowired
    CommandeRepository commandeRepository;
    @Autowired
    UserRepository userRepository;
    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande getCommandeById(long id) {
        return commandeRepository.findById(id).get();
    }
    @Override
    public List<Commande> getCommandeByClient(long id) {
       UserEntity user= userRepository.findById(id).get();
        return commandeRepository.findByClient((Client) user);
    }
    @Override
    public List<Commande> getCommandeByStat(Stat stat) {
        return commandeRepository.findByStat(stat);
    }
    @Override
    public List<Commande> getCommandeByChauffeur(long id) {
        UserEntity user= userRepository.findById(id).get();
        return commandeRepository.findByChauffeur((Chauffeur) user);
    }
    @Override
    public Commande addCommande(Commande commande) {

        commande.setStat(Stat.EN_ATTENTE);
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public void deleteCommande(long id) {
        commandeRepository.deleteById(id);
    }
}
