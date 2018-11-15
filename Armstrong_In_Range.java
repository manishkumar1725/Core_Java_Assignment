package DataStructure_Project;

public class Armstrong_In_Range {

	public static void main(String[] args) {

		int sum;
		int remainder;
		int temp;

		for (int number = 100; number <= 999; number++) {
			
			
			sum=0;
			temp = number;
			
			while (temp != 0) {
				remainder = temp % 10;
				sum = sum + (remainder * remainder * remainder);
				temp = temp / 10;
			}

			
			if(sum==number) {
				System.out.println("THE ARMSTRONG NUMBER BETWEEN 100 AND 999 ARE:"+number);
			}

		}

	}

}
