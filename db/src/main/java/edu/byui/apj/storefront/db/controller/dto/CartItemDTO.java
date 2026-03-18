package edu.byui.apj.storefront.db.controller.dto;

public record CartItemDTO(
        Long id,
        String productId,
        String productName,
        int quantity,
        double price
) {}
