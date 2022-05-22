package week2;

public class Week2Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array with the following values 1, 5, 2, 8, 13, 6.
		int[] numbers = new int[6];
		numbers[0] = 1;
		numbers[1] = 5;
		numbers[2] = 2;
		numbers[3] = 8;
		numbers[4] = 13;
		numbers[5] = 6;
		
		//print out the first element in the array
	//	System.out.println(numbers[0]);
		//print out the last element in the array without using the number 5
	//	System.out.println(numbers[6 - 1]); //System.out.println(numbers[number.length - 1]); also works
		//print out the element in the array at position 6. What happened?
	//	System.out.println(numbers[6]); this prints: Index 6 out of bounds for length 6
		//print out the element in the array at position -1. What happened?
	//	System.out.println(numbers[-1]); this prints: Index -1 out of bounds for length 6
		//write a traditional for loop that prints out each element in the array
	//	for (int a = 0; a < numbers.length; a++)
	//	{System.out.println(numbers[a]);}
		// write an enhanced for loop that prints out each element in the array
	//	for (int number : numbers){System.out.println(number);}
		
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
			System.out.println(sum);
		//create a new variable called average and assign the average value of the array to it
		int average = sum / numbers.length;
		
		System.out.println(average);
		// write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int number : numbers) {
			if (number % 2 ==1) {System.out.println(number);}
		}
		//create an array that contains the values "Sam", "Sally', "Thomas", and "Robert"
		String[] name = {"Sam", "Sally", "Thomas", "Robert"};
		
		//calculate the sum of all the letters in the new array
		int sumLetters = 0;
		for(String names : name) {
		sumLetters += names.length();}
		System.out.println(sumLetters);
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
				greeting("Tom");
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		greet("Pam");
		//analyze the difference between these two methods - what do you din? How are they different?
		
		//write and test a method that takes a String ands an int and returns true if the number of letters in the String is greater than the int
		boolean result = isStringLongerThanInt("Impossible", 4);
		System.out.println(result);
		//write and test a method that takes an array of String and a string and returns true if the string passed in exits in the array
		String[] test = new String[2];
		test[0] = "works";
		test[1] = "great";
		
		System.out.println(arrayTest(test, "works"));
		//write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println(smallestNumber(numbers));
		//write and test a method that takes an array of double and returns the average
		
		//write and test a method that takes an array of Strings and returns an array of int where each element
		//matches the length of the string at that position
		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
		//even amount of letters is greater than the sum of those with an odd amount of letters
		
		//write and test a method that takes a String and returns true if the string is a palindrome
		
		
		
		
		
		
		
		
		
	}

	public static void greeting(String name) {System.out.println("Greetings, " + name + ".");}
	public static String greet(String name1) {
		return "Greetings, " + name1 + ".";
	}
	public static boolean isStringLongerThanInt(String string, int number2) {
	return string.length() > number2;
	}
	
	public static boolean arrayTest(String[] test, String tester) {
		for (String string : test) {
			if (string.equals(tester)) {return true;}
		}
		return false;
	}
	public static int smallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
