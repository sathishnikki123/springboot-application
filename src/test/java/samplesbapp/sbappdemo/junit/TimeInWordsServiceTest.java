package samplesbapp.sbappdemo.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import samplesbapp.sbappdemo.service.TimeInWordsService;

public class TimeInWordsServiceTest {
	TimeInWordsService timeWordsService=new TimeInWordsService();
	@Test
	public void  getTimeinWordsTestHrsMntsnotzero() throws IOException {
		String time="18:23";
		String actual = timeWordsService.getTimeinWords(time);
		String Expected="EighteenTwenty-three	 Its midway";
		assertEquals(Expected,actual);
	}
	
	@Test
	public void  getTimeinWordsTestHrsMntszero() throws IOException {
		String time="00:00";
		String actual = timeWordsService.getTimeinWords(time);
		String Expected="Zero Zero Zero Zero Its midnignt";
		assertEquals(Expected,actual);
	}
	
	@Test
	public void  getTimeinWordsTestHrszero() throws IOException {
		String time="00:06";
		String actual = timeWordsService.getTimeinWords(time);
		String Expected="Zero Zero Six Its midnignt";
		assertEquals(Expected,actual);
	}
	
	@Test
	public void  getTimeinWordsTestMntszero() throws IOException {
		String time="14:00";
		String actual = timeWordsService.getTimeinWords(time);
		String Expected="Fourteen Zero Zero Its midway";
		assertEquals(Expected,actual);
	}
	@Test
	public void  getTimeinWordsTestMntszeromidnignt() throws IOException {
		String time="01:00";
		String actual = timeWordsService.getTimeinWords(time);
		String Expected="OneZero Zero Its midnignt";
		assertEquals(Expected,actual);
	}
	
	

}
