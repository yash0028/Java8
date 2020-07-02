package Lambda;



@FunctionalInterface


//Lambda expression provides implementation of functional interface. 
//An interface which has only one abstract method is called functional interface. 
//Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.


public interface WebPage {
	
	void header(String value, int age);

}
