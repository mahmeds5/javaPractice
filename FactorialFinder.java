public class FactorialFinder {
	public static void main (String [] args){
		//Program to print the factorial of a number n 
		int n = -2	;
		int repeat = 1;
		int product = n;
		String overFlowMsg = "";
		
		
		
		//3! = 3 * 2 * 1 ==> (3 - 0) * (3-1) * ((3 - 2)
		//10! = (10 - 1) * (10 - 1) * (10 - 2) * (10 - 3) * ..... * (10 - 9)
		
		for (int i = 1; i < n; i++){
			product = (n - i) * product;
		}
		
		if ( n == 0){
			product = 1;
		} else if (n > 12){
			overFlowMsg = " ERROR: Corrupted Result, N > 12. Your n value of " + n + " overflows Java's 32 bits assigned to an integer.";
			System.out.println(overFlowMsg);
		} else if (n < 0 ) {
			String lessZero = "Error. Facotiral cannot be calculated for a negative number.";
			System.out.println(lessZero);
		} else {
			System.out.println(n + "! = " + product);	
		}
		

		
		
		
	}	
}	
