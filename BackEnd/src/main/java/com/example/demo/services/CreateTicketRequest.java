package com.example.demo.services;

import com.example.demo.domain.Entities.TicketPriority;

public record CreateTicketRequest(
        String title, String description, TicketPriority priority
) {
}