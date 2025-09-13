package com.datta.modeapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data           // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor  // Generates no-args constructor
@AllArgsConstructor
@Builder
public class Otp {
    private boolean success;
    private String message;
}
