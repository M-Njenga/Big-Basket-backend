package com.classic.BigBasket.Service;

import com.classic.BigBasket.Dto.ProductDto;
import com.classic.BigBasket.Entity.Product;

import java.util.List;

public interface ProductService {
    String CreateProduct(ProductDto productDto);

    List<ProductDto> GetAllProducts();

    ProductDto getProductById(int productId);

    void deleteProductById(int productId);

    Product updateProduct(int productId, ProductDto productDto);
}
