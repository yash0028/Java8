package Lambda;

public class Lambda1 {

	public static void main(String[] args) {

        // Lambda expression without return keyword.  

		WebPage1 w1 = (a,b) -> (a+b);
		System.out.println("Addition output " +w1.add(10, 20));	
		
		
        // Lambda expression with return keyword.  

		WebPage1 w2 = (a,b) -> {return(a+b);};

		System.out.println("Addition output " +w2.add(20, 20));	

			
	}

}
