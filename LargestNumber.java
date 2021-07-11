package JavaWeek2Lab;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2, number3 = 0;
		System.out.println("Program to find the Largest Number");
		System.out.println("*********************************");
		System.out.println("Enter value for First Number");
		number1 = input.nextInt();
		System.out.println("Enter value for Second Number");
		number2 = input.nextInt();
		System.out.println("Enter value for Third Number");
		number3 = input.nextInt();
		
		if (number1 >= number2 && number1 >= number3) {
			System.out.println(number1 + " is the Largest number");	
		} 
		else if (number2 >= number1 && number2 >= number3) {
			System.out.println(number2 + " is the Largest number");	
		}
		else {
			System.out.println(number3 + " is the Largest number");
		}
	}
}
