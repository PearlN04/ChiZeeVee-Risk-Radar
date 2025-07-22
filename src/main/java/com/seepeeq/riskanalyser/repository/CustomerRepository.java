package com.seepeeq.riskanalyser.repository;

import com.seepeeq.riskanalyser.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*handles all interactions with the database */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}
