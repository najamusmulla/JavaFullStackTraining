package JavaWeek2Lab;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("To know Quotient and Remainder...");
		System.out.println("Please Enter Dividend : ");
		int dividend = reader.nextInt();
		System.out.println("Please Enter Divisor : ");
		int divisor = reader.nextInt();
		int quotient = dividend/divisor, remainder = dividend%divisor;
		System.out.println("The Quotient is " + quotient);
		System.out.println("The Remainder is " + remainder);
	}
}
