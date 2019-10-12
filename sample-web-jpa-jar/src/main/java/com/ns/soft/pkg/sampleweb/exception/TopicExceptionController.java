package com.ns.soft.pkg.sampleweb.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TopicExceptionController {

	private Logger logger = LoggerFactory.getLogger(TopicExceptionController.class);

	@ExceptionHandler(value = TopicNotFoundException.class)
	public ResponseEntity<Object> exception(TopicNotFoundException exception) {
		return new ResponseEntity<>("Topic not found  ", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<Object> genericException(Exception exception) {
		logger.error("genericException {}", exception);
		return new ResponseEntity<>("Exception Occured", HttpStatus.NOT_FOUND);
	}
}
