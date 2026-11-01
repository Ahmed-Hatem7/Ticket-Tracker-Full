package com.example.demo.controllers;

import com.example.demo.domain.DTO.CreateTicketRequestDTO;
import com.example.demo.domain.DTO.TicketResponseDTO;
import com.example.demo.domain.Entities.Ticket;
import com.example.demo.mapper.TicketMapper;
import com.example.demo.services.CreateTicketRequest;
import com.example.demo.services.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/tickets")
public class TicketController {

    private final TicketService ticketService;
    private final TicketMapper ticketMapper;

    TicketController(TicketService ticketService, TicketMapper ticketMapper) {
        this.ticketService = ticketService;
        this.ticketMapper = ticketMapper;

    }
    @PostMapping
    public ResponseEntity<TicketResponseDTO> createTicket(@RequestBody CreateTicketRequestDTO createTicketRequestDTO){

        CreateTicketRequest createTicketRequest=ticketMapper.toServiceRequest(createTicketRequestDTO);
        Ticket ticket=ticketService.createTicket(createTicketRequest);
        TicketResponseDTO ticketCreated=ticketMapper.toResponse(ticket);

        return new ResponseEntity<>(ticketCreated, HttpStatus.CREATED);
    }

    @GetMapping
    public List<TicketResponseDTO> lisTickets(){
        List<Ticket> tickets=ticketService.listAllTickets();
        List<TicketResponseDTO>DTOlist=new ArrayList<>();
        for ( Ticket ticket : tickets){
            DTOlist.add(ticketMapper.toResponse(ticket));
        }
        return DTOlist;


    }

}

