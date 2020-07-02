package com.yash.jdk8;


@FunctionalInterface
public interface Page {
	
	public void greet(); // Only one abstract method
	
	public static void test() {
		 
		//One Static Method
		
	}
	
	default  void display() {
		
		// One Default Method
		
	}
	
}
