package com.example.demo.domain.DTO;

import com.example.demo.domain.Entities.TicketPriority;
import com.example.demo.domain.Entities.TicketStatus;

import java.util.UUID;

public record UpdateTicketRequestDTO(
        String title,
        String description,
        TicketStatus status,
        TicketPriority priority
) {
}
