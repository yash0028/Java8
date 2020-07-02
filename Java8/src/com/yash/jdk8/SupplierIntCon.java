package com.yash.jdk8;

import java.util.function.Supplier;

public class SupplierIntCon {

	public static void main(String[] args) {

		/*
		 * There is no requirement that a new or distinct result be returned each time
		 * the supplier is invoked.
		 * 
		 * This is a functional interface whose functional method is get().
		 * 
		 *  takes no argument but returns a result
		 */
		
		getText(() -> "Java");
		getText(() -> "SDET");
		getText(() -> "Yash");
		
		
		
		
		
		
	}

	
	public static void getText(Supplier<String> text) {
		
		System.out.println(text.get());
		System.out.println(text.get().length());

		
	}
	
	
	
}
