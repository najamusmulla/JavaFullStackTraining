package JavaWeek3Lab;

/*
	* Question: 4. Write a program to find weather a number is Prime or not
	* Author  : KNG21076 - Najamus Sahar M. Mulla
*/

import java.util.Scanner;

public class IsPrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		boolean isPrime = true;
		System.out.println("To know whether the number entered by User is a Prime No. or not a Prime No.");
		System.out.println("------------------------------------------------------------------------------");
		System.out.print("Please Enter a Number Value: ");
		number1 = input.nextInt();
		for (int cnt=2; cnt <= number1/2; cnt++) {
			if (number1%cnt == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(number1 + " is a Prime Number.");
		}
		else {
			System.out.println(number1 + " is not a Prime Number.");
		}
		input.close();
			
	}
}
