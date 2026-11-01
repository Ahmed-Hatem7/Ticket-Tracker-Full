package com.example.demo.domain.Entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum TicketStatus {
    @Enumerated(EnumType.STRING)
    OPEN,
    CLOSED,
    IN_PROGRESS
}
