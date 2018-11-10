package _01_Simple_Array_Algorithms;

import java.lang.reflect.Array;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	
	public static void main(String[] args) {
		int[] numbers = {10, 25, 30, 20, 35};
		sumIntArray(numbers);
		averageIntArray(numbers);
		containsIntValue(numbers, 25);
		
		
	}
	
	public static int sumIntArray(int[] values) {
 int arraySum = 0;
 
 	for(int i = 0; i < values.length; i ++) {
 		
 		arraySum = arraySum += values[i]; 
 	 }
 	
 	System.out.println("Sum of values: " + arraySum);
			return arraySum;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
	int total = 0;
	double arrayAverage = 0.0;
		
	for(int i = 0; i < values.length; i++) {
		
	total = total += values[i];
	}
	arrayAverage = total/values.length;
	System.out.println("Average of values: " + arrayAverage);
	return arrayAverage;
	
	}	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
	
	for(int i = 0; i < array.length; i ++) {
	if(array[i] == value ) {
		System.out.println("Value found at " + i);
		return true;
		}
	else {
		System.out.println("Value not found.");
		return false;
	  }
}
  
	return false;
}
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] == value) {
				
				
				return i;
}
			else {
			
				return -1;
	}
}
			
		
		
		return 0;
	}
}

