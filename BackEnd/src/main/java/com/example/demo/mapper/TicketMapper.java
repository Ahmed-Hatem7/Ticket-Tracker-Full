package com.example.demo.mapper;

import com.example.demo.domain.DTO.CreateTicketRequestDTO;
import com.example.demo.domain.DTO.TicketResponseDTO;
import com.example.demo.domain.Entities.Ticket;
import com.example.demo.services.CreateTicketRequest;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {
    public CreateTicketRequest toServiceRequest(CreateTicketRequestDTO DTO){
        return new CreateTicketRequest(DTO.title(), DTO.description(), DTO.priority());
    }

    public TicketResponseDTO toResponse(Ticket ticket){
        return new TicketResponseDTO(ticket.getId(),ticket.getTitle(),ticket.getDescription(),
                ticket.getStatus(),ticket.getPriority(),ticket.getCreatedAt());
    }

}
