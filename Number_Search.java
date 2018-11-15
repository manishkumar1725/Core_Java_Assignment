package DataStructure_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_Search {

	public static void main(String[] args) {
		
	int[] Array_list = new int[15];
	int num;
	int search;
	
	Scanner number=new Scanner(System.in);
	
	System.out.println("Enter the Numbers:");
	
	for(num=0;num<15;num++)
	{
		Array_list[num]=number.nextInt();
	}
	
	System.out.println("Enter the Numbers To Search:");
	search=number.nextInt();
	
	
	for(num=0;num<15;num++)
	{
		if(Array_list[num]==search)
		{
			System.out.println("Number Found!!");
			System.out.println("Index of Number is:"+num);
		}
	}

	}

}

