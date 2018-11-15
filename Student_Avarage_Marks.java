package DataStructure_Project;

import java.util.Scanner;

public class Student_Avarage_Marks {

	public static void main(String[] args) {
		
		int[] Student1_Marks = new int[3];
		int[] Student2_Marks = new int[3];
		int[] Student3_Marks = new int[3];
		int marks;
		int Total_Marks1=0;
		int Total_Marks2=0;
		int Total_Marks3=0;
		int Avarage_1=0;
		int Avarage_2=0;
		int Avarage_3=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student_1 Marks:");
		
		for(marks=0;marks<3;marks++)
		{
			Student1_Marks[marks]=input.nextInt();
		}

		System.out.println("Enter Student_2 Marks:");
		
		for(marks=0;marks<3;marks++)
		{
			Student2_Marks[marks]=input.nextInt();
		}

		System.out.println("Enter Student_3 Marks:");
		
		for(marks=0;marks<3;marks++)
		{
			Student3_Marks[marks]=input.nextInt();
		}
	
		for(marks=0;marks<3;marks++)
		{
			Total_Marks1= Total_Marks1 + Student1_Marks[marks];
			
			Total_Marks2= Total_Marks2 + Student2_Marks[marks];
		
			Total_Marks3= Total_Marks3 + Student3_Marks[marks];
			
		}
		
		System.out.println("Total Student_1 Marks:"+Total_Marks1);
		System.out.println("Total Student_2 Marks:"+Total_Marks2);
		System.out.println("Total Student_3 Marks:"+Total_Marks3);
		
		for(marks=0;marks<3;marks++)
		{
			Avarage_1= (Student1_Marks[0]+Student1_Marks[1]+Student1_Marks[2])/3;
			
			Avarage_2= (Student2_Marks[0]+Student2_Marks[1]+Student2_Marks[2])/3;
		
			Avarage_3= (Student3_Marks[0]+Student3_Marks[1]+Student3_Marks[2])/3;
		}
		
		System.out.println("Avarage of Student_1 Marks:"+Avarage_1);
		System.out.println("Avarage of Student_2 Marks:"+Avarage_2);
		System.out.println("Avarage of Student_3 Marks:"+Avarage_3);
		
			

	}

}
