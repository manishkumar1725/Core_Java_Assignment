package DataStructure_Project;

import java.util.Scanner;

public class Simple_And_Compound_Interest {
	
	public static void main(String args[]) {
		
		
		float Principal_Amount;
		float Rate;
		int Time;
		
	
		
		double Simple_Interest;
		double Compound_Interest;
		
		Scanner Interest = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount:");
		Principal_Amount = Interest.nextFloat();
		
		System.out.println("Enter Rate Of Interest:");
		Rate = Interest.nextFloat();
		
		System.out.println("Enter Time Period:");
		Time = Interest.nextInt();
		
		
		Simple_Interest = (Principal_Amount * Rate * Time)/100;
		
		System.out.println("SIMPLE INTEREST:"+Simple_Interest);
		
		
		Compound_Interest = Math.pow(Principal_Amount * (1+(Rate/Time)),(Rate * Time));
		
		System.out.println("COMPOUND INTEREST:"+Compound_Interest);
		
	}

	
}
