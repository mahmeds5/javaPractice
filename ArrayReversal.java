import java.util.*;
public class ArrayReversal {
	public static void main (String[] args){
		//Reverse an Array
		// a b c d 
		// d c b a 	
		int[] a = {1, 2, 3, 4, 5};
		int pointerA = 0;
		int pointerB = a.length - 1;
		while (pointerA < pointerB){
			int temp = a[pointerA];
			a[pointerA] = a[pointerB];
			a[pointerB] = temp;
			pointerA++;
			pointerB--;
		}
		
		System.out.println(Arrays.toString(a));


		//ANOTHER ALGORITHM
		int[] a = {2,4,6,8,10};
        for (int i = 0; i < a.length/2; i++){
            int temp = 0;
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(a));
	}
}	
