package com.example.demo.services;

import com.example.demo.domain.Entities.TicketPriority;
import com.example.demo.domain.Entities.TicketStatus;


public record UpdateTicketRequest(
        String title,
        String description,
        TicketStatus status,
        TicketPriority priority
) {
}
