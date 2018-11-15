package DataStructure_Project;

import java.util.Scanner;

public class Result_Declaration {

	public static void main(String[] args) {
		
		int marks_1,marks_2,marks_3;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Marks 1:");
		marks_1=sc.nextInt();
		System.out.println("Enter Marks 2:");
		marks_2=sc.nextInt();
		System.out.println("Enter Marks 3:");
		marks_3=sc.nextInt();
		
		if(marks_1 > 60 && marks_2 > 60 && marks_3 > 60)
		{
			System.out.println("PASSED!!");
		}
		else if((marks_1 > 60 && marks_2 > 60) || (marks_2 > 60 && marks_3 > 60) ||marks_3 > 60 && marks_1 > 60)
		{
			System.out.println("PROMOTED");
		}
		else if((marks_1 < 60 && marks_2 < 60 && marks_3 < 60) || (marks_1>60 && marks_2 <60 && marks_3 <60)|| (marks_2>60 && marks_1 <60 && marks_3 <60) ||(marks_3>60 && marks_1 <60 && marks_2 <60)) {
			
			System.out.println("FAILED");
		}

	}

}
