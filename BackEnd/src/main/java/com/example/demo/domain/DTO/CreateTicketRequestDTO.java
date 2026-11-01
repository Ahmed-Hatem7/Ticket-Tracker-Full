package com.example.demo.domain.DTO;

import com.example.demo.domain.Entities.TicketPriority;

public record CreateTicketRequestDTO(

        String title,
        String description,
        TicketPriority priority
) {
}
