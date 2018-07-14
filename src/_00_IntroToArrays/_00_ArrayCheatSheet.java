package _00_IntroToArrays;

import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		
		
		//1. make an array of 5 Strings
		String[]ger = new String[5];
		//2. print the third element in the array
		System.out.println(ger[3]);
		//3. set the third element to a different value
		ger[3] = "amazing";
		//4. print the third element again
		System.out.println(ger[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		/*for (int i = 0; i < ger.length; i++) {
			ger[i] = "am";
			System.out.println(ger[i]);
		}*/
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < ger.length; i++) {
			System.out.println(ger[i]);
		}
		//7. make an array of 50 integers
		int bof[] = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < bof.length; i++) {
		bof[i] = rand.nextInt();
}//9. without printing the entire array, print only the smallest number on the array
       for (int i = 50; i > bof.length; i--) {
    	   bof[i] = rand.nextInt();
    	   int j = bof[i];
    	   System.out.println(bof[i]);
    	   
		
	}
		System.out.println();
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
