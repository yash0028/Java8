package com.yash.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperaInterface {

	public static void main(String[] args) {


		/*
		 * Represents an operation on a single operand that produces a result of the
		 * same type as its operand. This is a specialization of Function for the case
		 * where the operand and result are of the same type.
		 * 
		 * This is a functional interface whose functional method is
		 * Function.apply(Object).
		 * 
		 * 
		 * 
		 */	
		
		
		UnaryOperator<Integer> func = x -> x*8;
		
		int result = func.apply(10);
		System.out.println(result);
		
		
		List<String> langlist = new ArrayList<String>();
		 langlist.add("Yash");
		 langlist.add("Raj");
		 langlist.add("Simha");
		 
		 System.out.println(langlist);
		 langlist.replaceAll(ele -> ele +" Simha ");
		 System.out.println(langlist);


		
		
		
		
		
		
		
		
		
		
		
		
	}

}
