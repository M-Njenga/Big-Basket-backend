package com.classic.BigBasket.Repo;

import com.classic.BigBasket.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
