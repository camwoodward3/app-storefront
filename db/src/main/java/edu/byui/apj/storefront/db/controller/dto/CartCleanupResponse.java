package edu.byui.apj.storefront.db.controller.dto;

import java.time.Instant;

public record CartCleanupResponse(
        int removedCount,
        int maxAgeMinutes,
        Instant cutoffTime,
        Instant runAt
) {}
