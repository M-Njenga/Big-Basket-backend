package com.classic.BigBasket.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="category")
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @Column(name="CategoryId", length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;

    @Column(name="CategoryName", length = 255)
    private String categoryName;

    @Column(name="ParentCategoryId", length=45)
    private int parentCategoryId;

    @Column(name="UserId", length=45)
    private int userId;
}
