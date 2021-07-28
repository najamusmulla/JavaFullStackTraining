package JavaWeek3Lab;

/*
 	* Question: 5. Write a program to calculate average of the n number using a separate function other than main.
 	* Author  : KNG21076 - Najamus Sahar M. Mulla
*/

import java.util.Scanner;

public class CalculateAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = 0; 
		double Average=0;
		System.out.println("To Calculate Average for the N Numbers");
		System.out.println("----------------------------------------");
		System.out.print("For how many numbers do you want to know the Average : ");
		number1 = input.nextInt();
		System.out.println();
		CalculateAverage obj = new CalculateAverage();
		Average = obj.CalculateAvg(number1);
		System.out.println();
		System.out.println("The Average of the " + number1 + " numbers entered is " + Average);
		input.close();
	}
	
	public double CalculateAvg(int Num) {
		int Avg=0;
		Scanner input2 = new Scanner(System.in);
		for (int i=1; i <= Num; i++) {
			System.out.println();
			System.out.print("Enter value for " + i + " : ");
			Avg += input2.nextInt();
		}
		input2.close();
		return (double) Avg/Num;
	}
}
