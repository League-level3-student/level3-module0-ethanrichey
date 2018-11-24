package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun maf = new MoreArrayFun();
		String[] sting = {"Man", "Heck", "Gamer", "Gaming"};
		maf.printStrings(sting);
		System.out.println("=================");
		maf.printStringsRev(sting);
		System.out.println("=================");
		maf.printStringsEO(sting);
		}

	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printStrings(String[] strings) {
		
		for(String s: strings) {
	System.out.println(s);
		}
	}
		

	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
public void printStringsRev(String[] strings) {
		
		for(int i = 3; i >= 0; i--) {
System.out.println(strings[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
public void printStringsEO(String[] strings) {
	
	for(int i = 0; i < strings.length; i += 2) {
		
		System.out.println(strings[i]);
	}
}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
public void printStringsRand(String[] strings) {
	int randNum = ((int)Math.random() * 3);
	 System.out.println(strings[randNum]);
		
	}	

	}
