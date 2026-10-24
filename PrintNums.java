public class Main {
	public static void PrintNums (String [] args){
		//Print all even  and odd numbers frrom rangeMin to rangeMax in two seperate lines. 
		//Practing using 'Continue' keyword in Java Loops to skip current reiteration.
		//Unecessary and complicated syntax exists, juust to practice them.
		//Readibliity was not kept in mind, more focus was on using what had been learned. 
		//Spelling was also not worried about I was doing this fast to test my logic
		
		int rangeMin = 0;
		int rangeMax = 0;
		int counter = rangeMin;
		
		int oldMin = rangeMin;
		int oldMax = rangeMax;
		boolean opposeError = false;
		
		
		int evenCount = 0;
		int oddCount = 0;
		
		int evenSum = 0;
		int oddSum = 0;
		
		int evenProduct = 1;
		int oddProduct = 1;
		
		boolean allClearMaster = true;
		boolean allClearEven = true;
		boolean allClearOdd = true; 
		
		//Odd arguments cause errors in formating. 
		//Below 4 lines set up items to check (and thus change formatting rules). 
		boolean minIsOdd = true; //T is Odd, F is Even
		boolean maxIsOdd = true; //T is Odd, F is Even
		
		/*
		Ended up not needing this. 
		
		if (rangeMin % 2 == 0) minIsOdd = false; //else case taken care of, since defaults to Odd. 
		if (rangeMax % 2 == 0) maxIsOdd = false; //else cause taken care of, since defaults to Odd. 
		*/
		
		
		String lineBreak = "----------------------------------------------------";
		
		for (int i = 0; i < 2; i++) System.out.println();
		for (int i = 0; i < 2; i++) System.out.println(lineBreak);
		//1x Line Break
		for (int l = 0; l < 1; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity.
		
		//Edge case if range is 0
		if (rangeMin == rangeMax){
			System.out.println("Min = Max, redirecting Algorithm.");
			if (rangeMin % 2 == 0){
				System.out.println(rangeMin + " is even and is the only number in the inclusive range.");
				evenSum = rangeMax;
				evenProduct = rangeMax;
				evenCount++;
			} else {
				System.out.println(rangeMin + " is odd  and is the only number in the inclusive range.");
				oddSum = rangeMax;		
				oddProduct = rangeMax;
				oddCount++;
			}
			
			for (int i = 0; i < 2; i++) System.out.println(); //syntax practice 
			System.out.println("SUMMARY");

			System.out.println("Min & Max: " + rangeMin);
			System.out.println("Range: " + "x = " + rangeMax);
			System.out.println("Total Numbers Counted: 1" );
			System.out.println("Even Numbers Counted: " + evenCount);
			System.out.println("Sum of Even Numbers: " + evenSum);	
			System.out.println("Product of Even Numbers: " + rangeMin);
			System.out.println("Odd Numbers Counted: " + oddCount);
			System.out.println("Sum of Odd Numbers: " + oddSum);
			System.out.println("Product of Odd Numbers: " + oddProduct);
			return; 
		}
		
		//Edge case if RangeMin exceeds RangeMax
		if (rangeMin > rangeMax){
			System.out.println("Minimum Range is higher than Maximum Range. Computation will lead to inifinite looping.");
			System.out.println("Swapping Minimum Range and Maximum Range.");
			rangeMax = oldMin;
			rangeMin = oldMax;
			System.out.println("NEW Min: " + rangeMin);

			
		}
		
		

		
		System.out.println("Odd and Even Numbers between " + rangeMin + " and " + rangeMax + " (inlcusive)." );
		
		//1x Line Break
		for (int l = 0; l < 1; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity. "System.out.println();" works. Obviously.
		
		counter = rangeMin;

		//Even Num
		System.out.println("Even Numbers");
		while (counter != rangeMax + 1) {
			if (counter % 2 == 0){
				System.out.print(counter);
				if (counter == rangeMax || counter == rangeMax - 1){  
					System.out.print(".");	
					System.out.println();						
				} else {
					System.out.print(", ");
				}
				evenSum = evenSum + counter;
				if (counter != 0) {
					evenProduct = evenProduct * counter;
				} else {
					evenProduct = evenProduct; 
				}
				counter++;
				evenCount++;
			} else {
				counter++;
				continue;
			}
		}
		System.out.println("Even Numbers Counted: " + evenCount);
		
		// --------------------------------------------------------------------------------------------------------------------
		
		for (int l = 0; l < 2; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity.  
		counter = rangeMin; //Reset!
		
		// --------------------------------------------------------------------------------------------------------------------
		
	
		
		//Odd Num
		System.out.println("Odd Numbers");
		while (counter != rangeMax + 1) {
			if (counter % 2 != 0){
				System.out.print(counter);
				if (counter == rangeMax - 1 || counter == rangeMax ){ 
					System.out.print(".");
					System.out.println();						
				} else {
					System.out.print(", ");
				}
				oddSum = oddSum + counter;
				if (counter != 0){
					oddProduct = oddProduct * counter;
				} else {
					oddProduct = oddProduct;
				}
				counter++;
				oddCount++;
			} else {
				counter++;
				continue;
			}
		}
		System.out.println("Odd Numbers Counted: " + oddCount);

		
		
		for (int i = 0; i < 2; i++) System.out.println(); //syntax practice 
		System.out.println("SUMMARY");
		if (opposeError == false){
			System.out.println("Min: " + rangeMin);
			System.out.println("Max: " + rangeMax);
		} else {
			System.out.println("Original Min: " + oldMin);
			System.out.println("Original Max: " + oldMax);
			System.out.println("The Original Min was less than the Original Max, and would thus lead to an infinite loop.");
			System.out.println("The program auto swapped them.");
			System.out.println("NEW Min: " + rangeMin);
			System.out.println("NEW Max: " + rangeMax);
			
		}

		System.out.println("Range: " + rangeMin+ " <= x <= " + rangeMax);
		System.out.println("Total Numbers Counted: " + (evenCount + oddCount));
		System.out.println("Even Numbers Counted: " + evenCount);
		System.out.println("Sum of Even Numbers: " + evenSum  + "(Extremly Large ranges may cause sum to go out of bounds and/or return false values.)");
		
		/*
		How do we know if something has 0 in the range?
			1. Min is 0, OR
			2. Max is 0, OR
			3. Min < 0 AND Max > 0 
		*/
		
		if (rangeMin ==  0 || rangeMax == 0 || (rangeMin < 0 && rangeMax > 0)){
			System.out.println("Product of Even Numbers, excluding 0: " + evenProduct + "(Large ranges may cause product to go out of bounds and/or return false values.)");
		} else {
			System.out.println("Product of Even Numbers: " + evenProduct + "(Medium to Large ranges may cause product to go out of bounds and/or return false values.)");
		}
		System.out.println("Odd Numbers Counted: " + oddCount);
		System.out.println("Sum of Odd Numbers: " + oddSum + "   (Extremly Large ranges may cause sum to go out of bounds and/or return false values.)");
		System.out.println("Product of Odd Numbers: " + oddProduct + "   (Medium to Large ranges may cause product to go out of bounds and/or return false values.)");


			
		
		
		//2x Line Break
		for (int l = 0; l < 2; l++) System.out.println(); //Practicing syntax. This is totally unecessary and hurts readablity.
		
		for (int i = 0; i < 2; i++) System.out.println(lineBreak);
		
		for (int i = 0; i < 2; i++) System.out.println();
		
	}	
}	
