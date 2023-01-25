package samplesbapp.sbappdemo.controller;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import samplesbapp.sbappdemo.exception.InvalidTimeException;
import samplesbapp.sbappdemo.service.TimeInWordsService;

@RestController
public class TimeController {
	@Autowired
	private TimeInWordsService timeInWordsSErvice ;
	@GetMapping(value="/timeinwords/{time}")
	public ResponseEntity<String> gettime(@PathVariable String time) throws IOException  {
		String timeInWords = timeInWordsSErvice.getTimeinWords(time);
		if(timeInWords.isEmpty()){
			throw new InvalidTimeException();			
		}
		else {
			return new ResponseEntity<String>(timeInWords,HttpStatus.OK);
			
		}	
		 }
	}	
		 
	
	


