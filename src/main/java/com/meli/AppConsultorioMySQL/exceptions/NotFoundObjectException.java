package com.meli.AppConsultorioMySQL.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundObjectException extends ApiException{

    public NotFoundObjectException(String objectName, Long id) {
        super("The object " + objectName + " with id #" + id + " does not exist", HttpStatus.BAD_REQUEST);
    }

}
