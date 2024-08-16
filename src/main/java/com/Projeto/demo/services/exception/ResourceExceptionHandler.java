package com.Projeto.demo.services.exception;



import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandartError> ResouceNotFound(ResourceNotFoundException e, 
			HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError err = new StandartError(Instant.now(), status.value(),error,
				e.getMessage(),request.getRequestURI());
				return ResponseEntity.status(status).body(err);
		
		
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandartError> Database(DatabaseException e, 
			HttpServletRequest request){
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandartError err = new StandartError(Instant.now(), status.value(),error,
				e.getMessage(),request.getRequestURI());
				return ResponseEntity.status(status).body(err);
		
		
	}

}
