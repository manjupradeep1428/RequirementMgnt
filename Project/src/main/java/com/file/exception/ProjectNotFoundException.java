package com.file.exception;

public class ProjectNotFoundException extends Exception{
	public ProjectNotFoundException(String errorResponse) {
		super(errorResponse);
	}
}
