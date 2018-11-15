package DataStructure_Project;

import java.util.Scanner;

public class Income_Tax {

	public static void main(String[] args) {
		
		int CTC;
		
	    float Tax_Amount;
	
	
		
		Scanner salary =new Scanner(System.in);
		System.out.println("Enter the CTC:");
		CTC=salary.nextInt();
		
		if(CTC < 180000)
		{
			Tax_Amount = 0;
			System.out.println("THE TAX AMOUNT IS NIL.");
		}
		else if(CTC >=181001 && CTC <= 300000)
		{
			Tax_Amount = CTC * 10/100;
		    System.out.println("THE TAX AMOUNT IS:"+Tax_Amount);
		}
		else if(CTC >=300001 && CTC <= 500000)
		{
			Tax_Amount = CTC * 20/100;
			 System.out.println("THE TAX AMOUNT IS:"+Tax_Amount);
		}
		else if(CTC >=500001 && CTC <= 1000000)
		{
			Tax_Amount = CTC * 30/100;
			 System.out.println("THE TAX AMOUNT IS:"+Tax_Amount);
		}
		

	}

}
