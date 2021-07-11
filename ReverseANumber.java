package JavaWeek2Lab;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, reversenum = 0;
		System.out.println("Input your number and press enter: ");
		num = in.nextInt();
		while (num != 0) {
			reversenum *= 10;
			reversenum += num % 10;
			num /= 10;
		}
		System.out.println("Reverse of input number is: "+reversenum);
	}
}
