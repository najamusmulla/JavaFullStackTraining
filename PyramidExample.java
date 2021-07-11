package JavaWeek2Lab;

import java.util.Iterator;

public class PyramidExample {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
