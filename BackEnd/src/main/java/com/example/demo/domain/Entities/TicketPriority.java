package com.example.demo.domain.Entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum TicketPriority {
    @Enumerated(EnumType.STRING)
    HIGH,
    MEDIUM,
    LOW
}
