package com.classic.BigBasket.Dto;


import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private int productId;

    @NotNull(message = "ProductSku cannot be null.")
    private String productSku;

    @NotNull(message = "Name cannot be null.")
    private String productName;

    @NotNull(message = "Price cannot be null.")
    private double productPrice;

    private String productShortName;

    private String productDescription;

    private LocalDate createdDate;


    private String deliveryTimeSpan;

    private int categoryId;

    @NotNull(message = "Price cannot be null.")
    private String productImageUrl;

    private int userId;


}
