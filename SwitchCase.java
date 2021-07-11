package JavaWeek2Lab;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("List of Programming Languages - Please select your option");
		System.out.println("---------------------------------------------------------");
		System.out.println("1. Java");
		System.out.println("2. C");
		System.out.println("3. C++");
		System.out.println("4. Python");
		
		System.out.println();
		System.out.println();
		System.out.println("Enter choice:");
		choice = sc.nextInt();
		System.out.println();
		System.out.println();
		switch (choice) {
		case 1:
			{
				System.out.println("Java selected"); break;
			}
		case 2:
			{
				System.out.println("C selected"); break;
			}
		case 3:
			{
				System.out.println("C++ selected"); break;
			}
		case 4:
			{
				System.out.println("Python selected"); break;
			}
		default:
			{
				System.out.println("Invalid choice entered"); break;
				
			}
		}
	}
}
