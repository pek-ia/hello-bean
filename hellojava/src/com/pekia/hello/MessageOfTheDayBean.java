package com.pekia.hello;
import java.time.LocalDate;

public class MessageOfTheDayBean {
		
	public String getMessage() {
		
		LocalDate today = LocalDate.now();
		return String.format("Welcome to %tA!", today);
	}

}
