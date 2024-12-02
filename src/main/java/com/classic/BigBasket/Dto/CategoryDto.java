package com.classic.BigBasket.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class CategoryDto {

        private int categoryId;

        private String categoryName;

        private int parentCategoryId;

        private int userId;

    }
