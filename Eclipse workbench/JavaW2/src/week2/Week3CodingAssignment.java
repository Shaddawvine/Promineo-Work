package week2;
public class Week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 37;
		
		int subtractedAges = ages[0] - ages[ages.length - 1];
		System.out.println(subtractedAges);
		
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		int average = sum / ages.length;
		System.out.println(average);
		
		
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		
		double sumofNameLetters = 0;
		for(String name : names) {
		sumofNameLetters += name.length();}
		double averageLettersOfNames = sumofNameLetters / names.length;
		System.out.println(averageLettersOfNames);
		
		
		int a = 0;
		for(; a < names.length;a++) {System.out.print(names[a] + " ");}
		System.out.println();
		
		//To access the last element of an array, you can either enter the code of the last item in the array
		//ex. names[5]
		//or you can enter a line of code that will always grab the last item in the array
		//ex. names[names.length - 1]
		
		//To access the first element of the array, you can enter the first item from the array
		//ex. names[0]
		
		//At the time that I wrote this (5/19/2022 6:53pm GMT) I could not find an alternate way to find the
		//first in an array or alternate methods for both, I know there has to be another way to access elements
		//in the array. If I can recall or find those solutions, I will amend this.
		int[] nameLengths = new int[names.length];
		int h = 0;
		for (; h < names.length; h++) {nameLengths[h] = names[h].length();
			System.out.print(nameLengths[h] + " ");}
		System.out.println();
		 	
		
		System.out.println(multipleString("Hello", 3));
		System.out.println(createFullName("Dustin", "Shaddawvine"));
		System.out.println(array(ages));
		
			double[] array1 = new double[5];
			array1[0] = 10.9;
			array1[1] = 9.8;
			array1[2] = 8.7;
			array1[3] = 7.6;
			array1[4] = 6.5;
			
			double[] array2 = new double[5];
			array2[0] = 5.4;
			array2[1] = 4.3;
			array2[2] = 3.2;
			array2[3] = 2.1;
			array2[4] = 1.0;
			
		
			
		System.out.println(averageOfArrayOne(array1));	
		System.out.println(averageOfTwoArrays(array1, array2));		
		System.out.println(willBuyDrink(true, 11.00));
		System.out.println(averageSumOfTwoArrays(array1, array2));
		
		
	}

	
	public static String multipleString(String word, int number) {
		String result = "";
		for (int c = 0; c < number; c++) {
			result += word;}
		return result;
	}
	
public static String createFullName(String x, String y) {
	return x + " " + y;
}
	
public static boolean array(int[]ages) {
	int sum = 0;
		for (int age : ages) {
			 sum += age;
		} if (sum > 100) {return true;}
		else {return false;}
	}
	

public static double averageOfArrayOne(double[] array1) {
	double result1 = 0;
	for(double arrayUno : array1) {result1 += arrayUno;}
		double averageUno = result1 / array1.length;
		return averageUno;
	
}




public static boolean averageOfTwoArrays(double[] array1, double[] array2) {	
	double sum1 = 0;
	double sum2 = 0;
	for (double arrayOne : array1) {sum1 += arrayOne;}
	double average1 = sum1 / array1.length;
	for(double arrayTwo : array2) {sum2 += arrayTwo;}
	double average2 = sum2 / array2.length;
	if (average1 > average2) {return true;}
	else {return false;}

}

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside = true && moneyInPocket > 10.50) {return true;}
	else {return false;}
}

public static double averageSumOfTwoArrays(double[] array1, double[] array2) {
	double custom1 = 0;
	double custom2 = 0;
	for (double arrayOne : array1) {custom1 += arrayOne;}
	double combo1  = custom1 / array1.length;
	for(double arrayTwo : array2) {custom2 += arrayTwo;}
	double combo2 = custom2 / array2.length;
	double combo3 = combo1 + combo2;
	double finalResult = combo3 / (array1.length + array2.length);
	return finalResult;
	//this method takes the sum of array 1 and the sum of array two, adds them together, and then gets an average
	//of the two arrays put together. I created it just to see what that number would be. 
	
	
}









}
