package com.esdrasdev.clientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esdrasdev.clientcrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
