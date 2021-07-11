package JavaWeek2Lab;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("Please Enter a Number : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (num%2 == 0) {
			System.out.println("The number entered is an Even Number");
		}
		else {
			System.out.println("The number entered is an Odd Number");	
		}
	}
}
