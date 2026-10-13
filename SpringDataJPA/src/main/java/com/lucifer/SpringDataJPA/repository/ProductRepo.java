package com.lucifer.SpringDataJPA.repository;

import com.lucifer.SpringDataJPA.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* In Spring Data JPA we don't need to write the query or create the class for the table, JPA will do that for us behind the scenes */

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
