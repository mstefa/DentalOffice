package com.meli.AppConsultorioMySQL.dtos;

import java.util.Date;

public class AppointmentRequestDto {
    private Long id;
    private Date init;
    private int duration;
    private String status;
    private Long patientId;
    private Long dentistId;
}
