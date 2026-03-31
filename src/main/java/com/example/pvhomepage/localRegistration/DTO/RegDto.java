package com.example.pvhomepage.localRegistration.DTO;

public record RegDto(Long id,
                     String timeStamp,
                     String teamLeader,
                     String Email,
                     String TeamName,
                     int StjPass,
                     int bakPass,
                     String msg){ }
