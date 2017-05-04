package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jonathancuningham on 5/4/17.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
