package JavaWeek2Lab;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, sum = 0;
		
		System.out.println("Please Enter any integer Value below 10: ");
		number = sc.nextInt();
		
		while(number <= 10) {
			sum += number++;
		}
		
		System.out.format("Sum of the Numbers From the While Loop is: %d ", sum);
	}
}
