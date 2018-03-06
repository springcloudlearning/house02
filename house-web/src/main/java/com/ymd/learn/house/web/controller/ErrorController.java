package com.ymd.learn.house.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorController.class);
	
	@ExceptionHandler(value={Exception.class, RuntimeException.class})
	public String error500(HttpServletRequest request, Exception exception) {
		LOGGER.error(exception.getMessage());
		LOGGER.error(request.getRequestURL() + " encounter 500");
		return "error/500";
	}
	
}
