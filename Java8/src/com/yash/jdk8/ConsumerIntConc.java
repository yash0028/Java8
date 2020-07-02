package com.yash.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIntConc {

	public static void main(String[] args) {

		/*
		 * Represents an operation that accepts a single input argument and returns no
		 * result. Unlike most other functional interfaces, Consumer is expected to
		 * operate via side-effects.
		 * 
		 * This is a functional interface whose functional method is accept(Object).
		 */	
		
	
	Consumer<String> fun = x -> System.out.println(x);
	fun.accept("This is a Consumer");
	
	
	List < Integer > list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	list.forEach( y -> System.out.println(y));
	
	
	
	
	
	}

}
