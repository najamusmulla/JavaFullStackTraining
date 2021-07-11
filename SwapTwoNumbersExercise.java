package JavaWeek2Lab;

import java.util.Scanner;

public class SwapTwoNumbersExercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float number1, number2 = 0f;
		System.out.println("Program to Swap Numbers");
		System.out.println("*********************************");
		System.out.println("Enter value for First Number");
		number1 = input.nextFloat();
		System.out.println("Enter value for Second Number");
		number2 = input.nextFloat();
		
		System.out.println("");
		System.out.println("Before Swap");
		System.out.println("-----------");
		System.out.println("First Number = " + number1);
		System.out.println("Second Number = " + number2);
		
		float temporary = number1;
		number1 = number2;
		number2 = temporary;
		
		System.out.println("");
		System.out.println("After Swap");
		System.out.println("-----------");
		System.out.println("First Number = " + number1);
		System.out.println("Second Number = " + number2);
			
	}
}
