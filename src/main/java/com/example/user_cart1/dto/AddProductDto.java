package com.example.user_cart1.dto;

import lombok.Data;

@Data
public class AddProductDto {
    private String title;

    private Double price;

    private String description;

    private Long categoryId;

    private String imageUrl;
}