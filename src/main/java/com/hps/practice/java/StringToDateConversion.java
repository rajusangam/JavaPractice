package com.hps.practice.java;

import java.text.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class StringToDateConversion {

	public static void main(String[] args) {
		 List<String> dateStrings = List.of("2023-08-01", "2024-04-19", "2025-12-31");

	        // Convert list of strings to list of dates
	        List<Date> dates = dateStrings.stream()
	                                      .map(StringToDateConversion::convertToDate)
	                                      .collect(Collectors.toList());
	        System.out.println("output:");
	        // Print list of dates
	        dates.forEach(System.out::println);
	}
	// Helper method to convert string to date
	static Date convertToDate(String dateString) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
        	Date d = dateFormat.parse(dateString); 
            return d;
        } catch (ParseException e) {
            // Handle parsing exception
            e.printStackTrace();
            return null; // Return null or throw custom exception as needed
        }
	}
}
