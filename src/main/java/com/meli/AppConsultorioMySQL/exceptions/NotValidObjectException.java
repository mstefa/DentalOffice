package com.meli.AppConsultorioMySQL.exceptions;

import org.springframework.http.HttpStatus;

public class NotValidObjectException extends ApiException{


    public NotValidObjectException(String objectName, Long id) {
        super("The object " + objectName + " with id #" + id + " is not valid for this operation", HttpStatus.BAD_REQUEST);
    }
}
