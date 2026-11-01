package com.example.demo.services;

import com.example.demo.domain.Entities.Ticket;
import com.example.demo.domain.Entities.TicketStatus;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public List<Ticket> listAllTickets(){
        List<Ticket>ticketList=ticketRepository.findAll();
        return ticketList;
    }

    public Optional<Ticket> findTicketById(UUID id)
    {
        return ticketRepository.findById(id);
    }
}
