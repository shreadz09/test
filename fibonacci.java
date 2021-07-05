package exam;

import java.util.Scanner;

public class fibonacci {

	public static void main(String alec[]) {
		
		int a=0, b=1, c;
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		int fib = input.nextInt();
		
		if (fib>20) {
			System.out.println("Please enter a number less than 20");
		}
		
		else if (fib==0) {
			System.out.println("Please enter a number larger than 0");
		}
		
		else if (fib==1) {
			System.out.print(a);
		}
		
		else {
			for (int i = 1; i <= fib; i++) {	
			      System.out.print(a + " ");
			      c = a + b;
			      a = b;
			      b = c;
			    }
		}
		
	}
	
}
