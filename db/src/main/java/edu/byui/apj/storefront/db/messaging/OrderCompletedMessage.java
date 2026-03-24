package edu.byui.apj.storefront.db.messaging;

import java.time.Instant;

public record OrderCompletedMessage(String eventType, Long orderId, Instant completedAt) {

    public static OrderCompletedMessage orderCompleted(Long orderId) {
        return new OrderCompletedMessage("ORDER_COMPLETED", orderId, Instant.now());
    }
}
