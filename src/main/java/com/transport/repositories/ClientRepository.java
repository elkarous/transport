package com.transport.repositories;

import com.transport.enteties.Client;
import com.transport.enteties.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClientRepository extends  JpaRepository<Client,Integer>{

}
