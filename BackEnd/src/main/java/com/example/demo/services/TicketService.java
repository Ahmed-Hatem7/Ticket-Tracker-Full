package com.example.demo.services;

import com.example.demo.domain.Entities.Ticket;
import com.example.demo.domain.Entities.TicketStatus;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(CreateTicketRequest ticketRequest) {
        Ticket ticket = new Ticket(ticketRequest.title(), ticketRequest.description(), TicketStatus.OPEN, ticketRequest.priority());

        return ticketRepository.save(ticket);

    }
}
