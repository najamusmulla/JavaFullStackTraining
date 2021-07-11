package JavaWeek2Lab;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows, number = 1, counter, j;
		
		System.out.println("Enter the number of rows for floyd's triangle:");
		rows = input.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("****************");
		for(counter=1; counter <= rows; counter++) {
			for(j=1; j<=counter; j++) {
				System.out.print(number++ + " ");
			}
			System.out.println();
		}
	}
}
