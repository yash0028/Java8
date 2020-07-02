package com.yash.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunInter {

	public static void main(String[] args) {
		/*
		 * Represents a predicate (boolean-valued function) of one argument.
		 * 
		 * This is a functional interface whose functional method is test(Object).
		 */	
		
	
		Predicate<Integer> func = x -> x > 5;
		
		List < Integer > list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(result);
		
		//Predicate with && :
		List<Integer> result1 = list.stream().filter(y -> y > 5 && y <10).collect(Collectors.toList());
		System.out.println(result1);
	
	
	
	}

}
