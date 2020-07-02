package com.yash.jdk8;

import java.util.function.BiFunction;

public class BinaryOperator {

	public static void main(String[] args) {

		/*
		 * Represents an operation upon two operands of the same type, producing a
		 * result of the same type as the operands. This is a specialization of
		 * BiFunction for the case where the operands and the result are all of the same
		 * type.
		 * 
		 * This is a functional interface whose functional method is
		 * BiFunction.apply(Object, Object).
		 */		
		
		
		
		//BinaryOperator<Integer> result = (x1,x2) -> x1+x2;
		
		
		BiFunction<Integer, Integer, Integer> func = (x1,x2) -> x1+x2;
		
		int result= func.apply(20, 25);
		
		System.out.println(result);

		
		
		
		
	}

}
