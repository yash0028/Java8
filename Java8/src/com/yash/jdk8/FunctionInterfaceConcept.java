package com.yash.jdk8;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		
		// Function <T, R> variable 
		// T -- the type of input to function
		// R -- the type of output to function

		
		Function <String,Integer> func = x -> x.length();
		
		int len=func.apply("This is Apply method in Function Interface");
		System.out.println(len);
		
		//Chaining Function 
		
		Function <Integer,Integer> func1 =  x  -> x*2;
		
		int result=func.andThen(func1).apply("This is Apply method in Function Interface");

		System.out.println(result);
		
		
		
		
	}

}
