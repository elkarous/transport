package com.transport.services;



import com.transport.enteties.*;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface CommandeService  {


    Commande updateCommande(Commande commande);

    Commande getCommandeById(long id);


    List<Commande> getCommandeByClient(long id);

    List<Commande> getCommandeByStat(Stat stat);

    List<Commande> getCommandeByChauffeur(long id);

    Commande addCommande(Commande commande);



    List<Commande> getAllCommandes();



    void deleteCommande(long id);


}
