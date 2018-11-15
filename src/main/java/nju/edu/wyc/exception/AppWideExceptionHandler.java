package nju.edu.wyc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {
	
	@ExceptionHandler(SpitterDuplicateException.class)
	public String handleSpitterDuplicateException(){
		return "error/duplicateSpitter";
	}
}
