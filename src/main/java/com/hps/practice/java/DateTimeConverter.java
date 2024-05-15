/**
 * 
 */
package com.hps.practice.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 */
public class DateTimeConverter {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        // Create a LocalDateTime object representing the current date and time
	        LocalDateTime now = LocalDateTime.now();
	        System.out.println("Current LocalDateTime: " + now);

	        // Create a LocalDateTime object for a specific date and time
	        LocalDateTime specificDateTime = LocalDateTime.of(2022, 5, 14, 15, 30);
	        System.out.println("Specific LocalDateTime: " + specificDateTime);

	        // Parsing a String to LocalDateTime using a DateTimeFormatter
	        String dateString = "2022-05-14T15:30:00";
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
	        System.out.println("Parsed LocalDateTime: " + parsedDateTime);

	        // Formatting LocalDateTime to a custom String representation
	        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	        System.out.println("Formatted LocalDateTime: " + formattedDateTime);

	        // Manipulating LocalDateTime
	        LocalDateTime modifiedDateTime = now.plusDays(1).minusHours(2);
	        System.out.println("Modified LocalDateTime: " + modifiedDateTime);

	        // Extracting date and time components
	        int year = now.getYear();
	        int month = now.getMonthValue();
	        int day = now.getDayOfMonth();
	        int hour = now.getHour();
	        int minute = now.getMinute();
	        int second = now.getSecond();
	        System.out.printf("Date components: %d-%02d-%02d%n", year, month, day);
	        System.out.printf("Time components: %02d:%02d:%02d%n", hour, minute, second);
	    }

}
