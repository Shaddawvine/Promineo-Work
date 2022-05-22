package week2;

import java.util.Scanner;

public class LoopsVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	for (int i = 0; i < 10; i++) {System.out.println(i);}
		
	/*	int x = 10;
		while (x < 10) {System.out.println(x);
		x++;
		}
		*/
		
		// Below is info from the User Input video
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Welcome, " + name + "!");
		int selection = 0;
		double total = 0;
		while (selection != 4) {
		System.out.println("Select an option:");
		System.out.println("1) add Elden Ring to shopping cart: 59.99");
		System.out.println("2) add Elder Scrolls: Oblivion to shopping cart: 19.99");
		System.out.println("3) add Final Fantasy Tactics to shopping cart: 29.99");
		System.out.println("4) Checkout");
		
		selection = sc.nextInt();
		
		switch (selection) {
		case 1: total += 59.99;
		break;
		case 2: total += 19.99;
		break;
		case 3: total += 29.99;
		break;
		case 4:
		break;	
		default: System.out.println("Please select a valid option.");
		}
		System.out.println("Your current total is: " + total);
		
		
	}
	}
}
