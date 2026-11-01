package com.example.demo.domain.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.UUID;

@Table
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id",updatable = false,nullable = false)
    private UUID id;

    @Column(name = "Title",nullable = false)
    private String title;

    @Column(name = "Description",length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status",nullable = false)
    private TicketStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "Priority",nullable = false)
    private TicketPriority priority;

    @CreationTimestamp
    @Column(name = "CreatedDate",nullable = false,updatable = false)
    private Instant createdAt;


    public Ticket(String title, String description, TicketStatus status, TicketPriority priority) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Ticket() {
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public TicketPriority getPriority() {
        return priority;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }
}
