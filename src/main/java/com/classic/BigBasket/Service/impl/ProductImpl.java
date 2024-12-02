package com.classic.BigBasket.Service.impl;

import com.classic.BigBasket.Dto.ProductDto;
import com.classic.BigBasket.Entity.Product;
import com.classic.BigBasket.Repo.ProductRepo;
import com.classic.BigBasket.Service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductImpl implements ProductService {


    private final ProductRepo productRepo;

    public ProductImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public String CreateProduct(ProductDto productDto) {

        Product product=new Product(

                productDto.getProductId(),
                productDto.getProductSku(),
                productDto.getProductName(),
                productDto.getProductPrice(),
                productDto.getProductShortName(),
                productDto.getProductDescription(),
                productDto.getCreatedDate(),
                productDto.getDeliveryTimeSpan(),
                productDto.getCategoryId(),
                productDto.getProductImageUrl(),
                productDto.getUserId()

        );

        productRepo.save(product);

        return "Saved";
    }

    @Override
    public List<ProductDto> GetAllProducts() {
        List<Product> products = productRepo.findAll();
        return products.stream()
                .map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(int productId) {

        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));;
        return mapToDTO(product);
    }
@Transactional
    @Override
    public void deleteProductById(int productId) {
        if(!productRepo.existsById(productId)){
            throw new RuntimeException("Product with Id"+ productId+" not found.");
        }
        productRepo.deleteById(productId);
    }

    @Override
    public Product updateProduct(int productId, ProductDto productDto) {

     Optional <Product>  optionalProduct = productRepo.findById(productId);

     if(optionalProduct.isPresent()){

         Product product = optionalProduct.get();
         product.setProductSku(productDto.getProductSku());
         product.setProductName(productDto.getProductName());
         product.setProductPrice(productDto.getProductPrice());
         product.setProductShortName(productDto.getProductShortName());
         product.setProductDescription(productDto.getProductDescription());
         product.setDeliveryTimeSpan(productDto.getDeliveryTimeSpan());
         product.setCategoryId(productDto.getCategoryId());
         product.setProductImageUrl(productDto.getProductImageUrl());
         product.setUserId(productDto.getUserId());

         return  productRepo.save(product);
     }else{
         throw new RuntimeException("Product not found with id: " + productId);
     }

    }

    private ProductDto mapToDTO(Product product){
        return new ProductDto(
                product.getProductId(),
                product.getProductSku(),
                product.getProductName(),
                product.getProductPrice(),
                product.getProductShortName(),
                product.getProductDescription(),
                product.getCreatedDate(),
                product.getDeliveryTimeSpan(),
                product.getCategoryId(),
                product.getProductImageUrl(),
                product.getUserId()
        );
    }
}
