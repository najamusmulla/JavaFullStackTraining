package JavaWeek2Lab;

import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter two Numbers for Multiplication:");
		System.out.println("Enter the First Number for Multiplication: ");
		int first_number = reader.nextInt();
		System.out.println("The First Number entered for Multiplication: " + first_number);
		
		System.out.println("Enter the Second Number for Multiplication: ");
		int second_number = reader.nextInt();
		System.out.println("The Second Number entered for Multiplication: " + second_number);
		
		int multiplication_result = first_number * second_number;
		System.out.println("The Multiplication Result of First Number and Second Number is : " + multiplication_result);
	
	}
}