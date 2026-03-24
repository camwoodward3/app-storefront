package edu.byui.apj.storefront.db.controller.dto;

public record OrderDetailsItemResponse(
        String productId,
        String produtName,
        int quantity,
        double price
) {}
