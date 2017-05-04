package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jonathancuningham on 5/4/17.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
