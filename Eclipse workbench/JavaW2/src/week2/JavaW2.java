package week2;

public class JavaW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  costOfMilk = 4;
		
		if (costOfMilk <= 2) { System.out.println("Buying 2");}
		else if (costOfMilk <= 3) { System.out.println("Buying 1");}
		else {System.out.println("Not buying any milk.");}
		
		int age = 10;
		if (age >= 16) {System.out.println("You can get your license!");}
		else {System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");}
		
		char grade = 'E';
		switch (grade) {
		case 'A': System.out.println("90%");
		break;
		case 'B': System.out.println("80%");
		break;
		case 'C': System.out.println("70%");
		break;
		default: System.out.println("0%");
		}
		
		String loyaltyMemberStatus = "Silver";
		double loyaltyMemberDiscount = 0.0;
		switch (loyaltyMemberStatus) {
		case "Silver": loyaltyMemberDiscount = .1;
		break;
		case "Gold": loyaltyMemberDiscount = .15;
		break;
		case "Platinum": loyaltyMemberDiscount = .25;
		}
		
		double billTotal = 350;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "Silver") {
				loyaltyMemberStatus = "Gold";}
				else if (loyaltyMemberStatus == "Gold") {
					loyaltyMemberStatus = "Platinum";
				}
			}
		System.out.println(loyaltyMemberStatus);
		System.out.println(adjustedTotal);
		
		
	}

}
