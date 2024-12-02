package com.classic.BigBasket.Controller;

import com.classic.BigBasket.Dto.CategoryDto;
import com.classic.BigBasket.Dto.ProductDto;
import com.classic.BigBasket.Entity.Product;
import com.classic.BigBasket.Service.CategoryService;
import com.classic.BigBasket.Service.ProductService;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

@RequestMapping("/api/BigBasket/")
public class ProductController {


    private final ProductService productService;
    private final CategoryService categoryService;

    public ProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }


    @GetMapping
public ResponseEntity<List<ProductDto>> GetAllProducts(){

        List<ProductDto> product= productService.GetAllProducts();
        return ResponseEntity.ok(product);
}
    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable int productId){
        ProductDto product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    @PostMapping(path="/CreateProduct")
    public ResponseEntity<?> CreateProduct(@Valid @RequestBody ProductDto productDto){

         productService.CreateProduct(productDto);
        return ResponseEntity.ok(Map.of("message","saved successfully"));
    }

    @PutMapping("/UpdateProduct/{productId}")
    public ResponseEntity<?> updateProduct(@PathVariable int productId, @RequestBody ProductDto productDto){

        productService.updateProduct(productId, productDto);
        return ResponseEntity.ok(Map.of("message","Updated successfully"));
    }

    @DeleteMapping("DeleteProductById/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable int productId){

        productService.deleteProductById(productId);
        return ResponseEntity.ok(Map.of("message","Deleted successfully"));
    }

    @GetMapping(path="/GetAllCategory")
    public ResponseEntity<List<CategoryDto>> GetAllCategory(){

        List<CategoryDto> category= categoryService.GetAllCategory();
        return ResponseEntity.ok(category);
    }


}
