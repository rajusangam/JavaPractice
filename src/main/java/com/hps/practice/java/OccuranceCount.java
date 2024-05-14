package com.hps.practice.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccuranceCount {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "Spring Security","Spring Rest Template","API" , "Microservices","AWS", "Rest API", "Spring API", "PCF","Azure", "Spring JPA", "Docker", "Kubernetes");

		List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4, 1, 9, 2, 5, 4);
//		numbers.stream().distinct().sorted().forEach(System.out::println);
		
//Count the No. of Occurance of given word in String List
//	System.out.println(courses.stream().filter(s->s.contains("API")).count());
//filter given String array/list with given prefix	
//	courses.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
//	courses.stream().map(s-> s+"  "+s.length()).sorted().forEach(System.out::print);
//	System.out.println();
//	courses.stream()
//	.sorted(Comparator.comparing(str -> str.length()))
//	.collect(Collectors.toList()).forEach(System.out::println);
	Entry<Integer, List<String>> own = courses.stream().sorted().collect(Collectors.groupingBy(s->s.length())).entrySet().stream().sorted((a,b)->b.getKey().compareTo(a.getKey())).findFirst().get();
	System.out.println(own.toString());
	}
	
}
