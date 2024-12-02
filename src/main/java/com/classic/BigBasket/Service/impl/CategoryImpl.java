package com.classic.BigBasket.Service.impl;

import com.classic.BigBasket.Dto.CategoryDto;
import com.classic.BigBasket.Dto.ProductDto;
import com.classic.BigBasket.Entity.Category;
import com.classic.BigBasket.Entity.Product;
import com.classic.BigBasket.Repo.CategoryRepo;
import com.classic.BigBasket.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public List<CategoryDto> GetAllCategory() {
        List<Category> categories = categoryRepo.findAll();
        return categories.stream()
                .map(this::mapToDTO).collect(Collectors.toList());

    }

    private CategoryDto mapToDTO(Category category){
        return new CategoryDto(
                category.getCategoryId(),
                category.getCategoryName(),
                category.getParentCategoryId(),
                category.getUserId()
        );
    }

}
