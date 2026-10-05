package com.smarthome.product.mapper;

import com.smarthome.product.dto.ProductRequest;
import com.smarthome.product.dto.ProductResponse;
import com.smarthome.product.entity.Product;

public final class ProductMapper {
    private ProductMapper() {
    }
    public static Product toEntity(ProductRequest request) {
        return new Product(
                request.getName(),
                request.getDescription(),
                request.getCategory(),
                request.getPrice(),
                request.getStockQuantity(),
                request.getImageUrl()
        );
    }
    public static ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getCategory(),
                product.getPrice(),
                product.getStockQuantity(),
                product.getImageUrl(),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
    public static void updateEntity(Product product, ProductRequest request) {
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setCategory(request.getCategory());
        product.setPrice(request.getPrice());
        product.setStockQuantity(request.getStockQuantity());
        product.setImageUrl(request.getImageUrl());
    }
}
