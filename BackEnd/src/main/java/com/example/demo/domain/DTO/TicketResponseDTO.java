package com.example.demo.domain.DTO;

import com.example.demo.domain.Entities.TicketPriority;
import com.example.demo.domain.Entities.TicketStatus;

import java.time.Instant;
import java.util.UUID;

public record TicketResponseDTO(
        UUID id,
        String title,
        String description,
        TicketStatus status,
        TicketPriority priority,
        Instant createdAt
) {
}
