package com.example.demo.repository;

import com.example.demo.domain.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@org.springframework.stereotype.Repository
public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
