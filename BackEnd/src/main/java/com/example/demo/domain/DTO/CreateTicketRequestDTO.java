package com.example.demo.domain.DTO;

import com.example.demo.domain.Entities.TicketPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.aspectj.lang.annotation.RequiredTypes;
import org.hibernate.validator.constraints.Length;

public record CreateTicketRequestDTO(

        @NotBlank(message = "Title can't be blank")
        @Size(max = 200)
        String title,

        @Size(max = 1000)
        String description,

        @NotNull(message = "Please select a priority")
        TicketPriority priority
) {
}
