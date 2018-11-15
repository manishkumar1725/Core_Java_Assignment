package DataStructure_Project;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		
		
		String Login_Name="Manish";
		String Password="Password";
		String Enter_Name = null;
		String Given_Password = null;
		int num;
		int count=0;
		Scanner Data = new Scanner(System.in);  
		
		 for(num=0;num<3;num++)
			{
		
		    System.out.println("Enter Name:");
			Enter_Name=Data.nextLine();
			
			System.out.println("Enter Password:");
			Given_Password=Data.nextLine();
			
			
	      if(Login_Name.equals(Enter_Name) && Password.equals(Given_Password))
			{
				System.out.println("WELCOME!!"+Login_Name);
				break;
		    }
	        
	        else
	        {
	        	System.out.println("Enter Again");
	        }
	      count++;
	      
	}
	       if(count==3)
	       {
	    	   System.out.println("Contact Admin!!");
	       }
			
	    
		
		

	}

}
