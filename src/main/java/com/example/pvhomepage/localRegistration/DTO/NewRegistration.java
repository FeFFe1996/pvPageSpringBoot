package com.example.pvhomepage.localRegistration.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record NewRegistration(
        @NotEmpty
        @NotEmpty
        String teamLeader,
        @Email
        String Email,
        @NotEmpty
        @NotNull
        String TeamName,
        @NotNull
        int StjPass,
        @NotNull
        int bakPass,
        @NotNull
        @Size(max = 250)
        String msg) {
}
