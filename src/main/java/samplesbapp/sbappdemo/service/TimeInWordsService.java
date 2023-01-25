package samplesbapp.sbappdemo.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TimeInWordsService {
public String getTimeinWords(String time_mnts) throws  IOException
	{
		List<String> hour_mint=null;
		 String time_name = ""; 
		 int hours =Integer.parseInt(time_mnts.substring(0, 2)) ;
		 int minutes = Integer.parseInt(time_mnts.substring(3));
	      if((hours>=0 && hours<=23) && (minutes>=0 && minutes<=59)){
	    	  try (BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\sathish\\Downloads\\sb-app-demo\\sb-app-demo\\src\\main\\resources\\data.txt"))) {
					hour_mint = new ArrayList<>();
					    String line = bufReader.readLine();
					    while (line != null) {
					    	hour_mint.add(line);
					      line = bufReader.readLine();
					    }
				}
	    	  if(hours>=12 && hours<=23) {	    	  
		  	  if (minutes==0)
		          time_name = hour_mint.get(hours-1)+" Zero Zero"+" Its midway";	  	  
		        else {
		          time_name = hour_mint.get(hours-1)+""+hour_mint.get(minutes-1)+" Its midway";
		      }
	    	  }
	    	  else {
	    	  if(hours==0 && minutes!=0) {
	    		  time_name="Zero Zero "+hour_mint.get(minutes-1)+ " Its midnignt";
	    	  }
	    	  else if(hours==00 && minutes==00) {
	    		  time_name="Zero Zero Zero Zero Its midnignt";
	    	  }
	    	  else  if (minutes==0 && hours!=0) {
			          time_name = hour_mint.get(hours-1)+"Zero Zero"+" Its midnignt";
	    	  }
	    	  else {
			  		time_name = hour_mint.get(hours-1)+""+hour_mint.get(minutes-1)+" Its midnignt";
			  	  }
	     
	    }
	      }
	    return 	time_name; 		
	}
}
