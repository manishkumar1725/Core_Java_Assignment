package DataStructure_Project;

public class Employee_details {
	
	String name;
	int id; 
	int age;
	
	Employee_details(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	void show_details()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}
 	 class ShowDetails{
	 public static void main(String args[]) {
		 
	     Employee_details e1 = new Employee_details("Akash",1234,16);
	     Employee_details e2 = new Employee_details("Jagdish",3421,18);
		 e1.show_details();
		 e2.show_details();
	 }

	
	
		
	}
 