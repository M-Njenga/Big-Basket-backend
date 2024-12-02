package com.classic.BigBasket.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name="product")
public class Product {
    @Id
    @Column(name="ProductId", length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    @Column(name="ProductSku", length = 255)
    private String productSku;

    @Column(name="ProductName", length = 255)
    private String productName;

    @Column(name="ProductPrice")
    private double productPrice;

    @Column(name="ProductShortName", length = 255)
    private String productShortName;

    @Column(name="ProductDescription", length = 255)
    private String productDescription;

    @Column(name="CreatedDate")
    private LocalDate createdDate;

    @Column(name="DeliveryTimeSpan", length = 255)
    private String deliveryTimeSpan;

    @Column(name="CategoryId", length=45)
    private int categoryId;

    @Column(name="ProductImageUrl", length = 255)
    private String productImageUrl;

    @Column(name="UserId", length=45)
    private int userId;

    public Product(int productId, String productSku, String productName, double productPrice, String productShortName, String productDescription, LocalDate createdDate, String deliveryTimeSpan, int categoryId, String productImageUrl, int userId) {

        this.productId = productId;
        this.productSku = productSku;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productShortName = productShortName;
        this.productDescription = productDescription;
        this.createdDate = createdDate;
        this.deliveryTimeSpan = deliveryTimeSpan;
        this.categoryId = categoryId;
        this.productImageUrl = productImageUrl;
        this.userId = userId;
    }

    public Product() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDeliveryTimeSpan() {
        return deliveryTimeSpan;
    }

    public void setDeliveryTimeSpan(String deliveryTimeSpan) {
        this.deliveryTimeSpan = deliveryTimeSpan;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + productId +
                ", ProductSku='" + productSku + '\'' +
                ", ProductName='" + productName + '\'' +
                ", ProductPrice=" + productPrice +
                ", ProductShortName='" + productShortName + '\'' +
                ", ProductDescription='" + productDescription + '\'' +
                ", CreatedDate=" + createdDate +
                ", DeliveryTimeSpan='" + deliveryTimeSpan + '\'' +
                ", CategoryId=" + categoryId +
                ", ProductImageUrl='" + productImageUrl + '\'' +
                ", UserId=" + userId +
                '}';
    }
}
