package com.meli.AppConsultorioMySQL.exceptions;

import com.meli.AppConsultorioMySQL.dtos.ErrorDTO;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiException extends Exception{
    private ErrorDTO error;
    private HttpStatus status;

    public ApiException(String message, HttpStatus status){
        this.error = new ErrorDTO();
        this.error.setMessage(message);
        this.error.setName(this.getClass().getSimpleName());

        this.status = status;

    }
}
