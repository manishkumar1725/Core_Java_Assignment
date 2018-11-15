package DataStructure_Project;

import java.util.Scanner;


public class Armstrong_num {

	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter the Number\n");
			         int number=sc.nextInt();
			         int count=0;
			         int temp = number;
			         int remainder;
			         int sum = 0;
			         
			         
			         while (temp != 0)
			         {
			        	 temp = temp/10;
			        	 count++;
			         }
			         temp=number;
			         while(temp !=0)
			         {
			        	 remainder=temp%10;
			        	 sum= (int) (sum + Math.pow(remainder,count));
			        	 temp = temp/10;
			         }
			         System.out.println(sum);
			 if(sum == number)
				System.out.println("Given Number is Armstrong Number!!");
				
		    else
				System.out.println("Given Number is NOT Armstrong Number!!");

			}

	

		

	}


