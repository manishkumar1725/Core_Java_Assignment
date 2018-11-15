package DataStructure_Project;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
	
		int[] Array_list = new int[15];
		int num_1;
		int search;
		int temp;
		int num_2; 
		
		Scanner number=new Scanner(System.in);
		
		System.out.println("Enter the Numbers:");
		
		for(num_1=0;num_1<15;num_1++)
		{
			Array_list[num_1]=number.nextInt();
		}
		
		for(num_1=0;num_1<15;num_1++)
		{
			for(num_2=0;num_2<14;num_2++)
			{
				if(Array_list[num_2] > Array_list[num_2+1])
				{
					temp =Array_list[num_2];
					Array_list[num_2] = Array_list[num_2+1];
					Array_list[num_2+1]=temp;
				}
			}
		}
		
		System.out.println("The Sorted Array is:");
		for(num_1=0;num_1<15;num_1++) 
		{
			System.out.println(Array_list[num_1]);
		}
		

	}

}
