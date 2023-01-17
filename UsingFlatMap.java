package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFlatMap {
	public static void main(String args[]) {
		List<String> firstList = Arrays.asList("Ram","Shyam","Shiv");
		List<String> secondList = Arrays.asList("Vikas","Vimal","Vicky");
		List<List<String>> combined = Arrays.asList(firstList,secondList);
		
		combined.forEach(System.out::println);
		
		List<String> mergedList = combined.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		mergedList.forEach(System.out::println);
	}
}

