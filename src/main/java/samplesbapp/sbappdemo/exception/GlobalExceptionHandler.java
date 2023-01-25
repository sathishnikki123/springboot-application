package samplesbapp.sbappdemo.exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(InvalidTimeException.class)
	public ResponseEntity<ErrorResponse> getInvalidTimeException(InvalidTimeException ex) 
	{
	    ErrorResponse error = new ErrorResponse(600,"please enter valid time",LocalTime.now());
	    return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
}
