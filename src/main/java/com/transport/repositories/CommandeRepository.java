package com.transport.repositories;

import com.transport.enteties.Chauffeur;
import com.transport.enteties.Client;
import com.transport.enteties.Commande;
import com.transport.enteties.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeRepository extends  JpaRepository<Commande,Long>{
 List<Commande>  findByClient(Client client);
 List<Commande>  findByChauffeur(Chauffeur chauffeur);
 List<Commande>  findByStat(Stat stat);
}
