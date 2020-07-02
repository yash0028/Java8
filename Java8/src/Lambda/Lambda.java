package Lambda;

public class Lambda {
	
	
	
	//The Lambda expression is used to provide the implementation of an interface which has functional interface. 
	//It saves a lot of code. In case of lambda expression, 
	//we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

	//Java lambda expression is treated as a function, so compiler does not create .class file.
	
	//Java Lambda Expression Syntax
	//(argument-list) -> {body}  
	//Java lambda expression is consisted of three components.

	//1) Argument-list: It can be empty or non-empty as well.

	//2) Arrow-token: It is used to link arguments-list and body of expression.

	//3) Body: It contains expressions and statements for lambda expression.

	public static void main(String[] args) {
		
		
		WebPage w1= (value, a)   ->   {System.out.println ("Hello " +value+ " age is " +a);};
	
		/*
		 * WebPage w2= (king) -> System.out.println("Hello " +king);
		 * 
		 * WebPage w3= (n) -> System.out.println("Kumar" +n.length());
		 */

		
		// ### Before Lambda
		/*
		 * 1.WebPage w1 = new WebPage() {
		 * 
		 * @Override 
		 * 
		 * public void header(String value) { System.out.println("hi "+value); } 
		 * };
		 * 
		 * 
		 * 2.
		 * WebPage w1 = new WebPage() {
		 * 
		 * @Override 
		 * 
		 * public void header(String value) { System.out.println("hello "+value); } 
		 * };
		 * 
		 * */
		
		
		
		w1.header("google",23);
		//w2.header("Yash");
		//w3.header("Kumar");
	}

}
