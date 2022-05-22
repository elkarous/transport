package com.transport.services;



import com.transport.enteties.Admin;
import com.transport.enteties.Chauffeur;
import com.transport.enteties.Client;
import com.transport.enteties.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {


    List<Client> getAllClient();

    List<Chauffeur> getAllChauffer();

    UserEntity updateUser(UserEntity user);

    UserEntity getUserById(int id);


    UserEntity addUser(UserEntity user);

    Client addClient(Client user);

    Chauffeur addChauffeur(Chauffeur user);


    Admin addAdmin(Admin user);

    List<UserEntity> getAllUsers();



    void deleteUser(int id);


    UserEntity getUserByEmail(String email);
}
