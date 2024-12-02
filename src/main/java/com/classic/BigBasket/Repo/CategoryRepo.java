package com.classic.BigBasket.Repo;


import com.classic.BigBasket.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
