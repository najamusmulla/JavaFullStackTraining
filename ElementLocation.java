package JavaWeek3Lab;

/*
* Question: 8. Write a program to find the location of element in the Array.
* Author  : KNG21076 - Najamus Sahar M. Mulla
*/

import java.util.Scanner;

public class ElementLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int elements = 0, l_instance = 0, element_value=0, l_index = 0;
		char l_choice;
		System.out.println("Program to find the location of element in the array");
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.print("How many Array elements you want to enter? :  ");
		elements = input.nextInt();
		int l_Array[] = new int [elements];
		System.out.println();
		System.out.println();
		for (int i = 0; i < elements; i++) {
			System.out.print("Enter value for Index " + i + " : ");
			l_Array[i] = input.nextInt();
			System.out.println();
		}
		do {
			System.out.println();
			System.out.print("What value of element you want to search?    : ");
			element_value = input.nextInt();
			System.out.println();
			System.out.print("What Instance of element you want to search? : ");
			l_instance = input.nextInt();
			System.out.println();
			if (l_instance <= 0) {
				System.out.print("Invalid value for Instance. Positive Integer value expected");
			}
			else {
				FindIndex f = new FindIndex();
				l_index = f.findIndex(l_Array, element_value, l_instance);
				if (l_index < 0) {
					System.out.print("Could not find the Instance " + l_instance + " of the value " + element_value + " in the array.");
				}
				else {
					System.out.print("The Instance " + l_instance + " of the value " + element_value + " in the array is at index " + l_index);					
				}
			}
			System.out.println();
			System.out.print("Do you want to Continue to find Index of other Numbers? : ");
			l_choice = input.next().charAt(0);
		} while (l_choice == 'Y' || l_choice == 'y');
		input.close();
	}
}

class FindIndex {
	public int findIndex(int l_Arr[], int element_value, int l_instance) {
		int l_index = -1;
		for (int i = 0; i < l_Arr.length; i++) {
			if (l_Arr[i] == element_value) {
				l_instance--;
			}
			if (l_instance == 0) {
				l_index = i;
				break;
			}
		}
		return l_index;
	}
}

