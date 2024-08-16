package com.Projeto.demo.services.exception;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
public ResourceNotFoundException(Object id) {
	super("Id not found" +id);
}
}
