package JavaWeek3Lab;

import java.util.Scanner;

/*
 	* Question: 7. Write a program to sort an array element in ascending or descending order
 	* Author  : KNG21076 - Najamus Sahar M. Mulla
*/

public class SortArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int elements = 0, sort_choice=0;
		System.out.println("Sorting of array elements in ascending or descending order");
		System.out.println("-----------------------------------------------------------");
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("New set of Entries");
			System.out.println("--------------------");
			System.out.print("How many Array elements you want to enter for sorting? :  ");
			elements = input.nextInt();
			if (elements == 0) break;
			int l_Array[] = new int [elements];
			int SortedArray[] = new int [elements];
			System.out.println();
			System.out.println();
			for (int i = 0; i < elements; i++) {
				System.out.print("Enter value for element " + (i+1) + " : ");
				l_Array[i] = input.nextInt();
				System.out.println();
			}
			System.out.println();
			System.out.print("How do you want to Sort the Array? \n\t0. To Exit \n\t1. Ascending \n\t2. Descending \nPress 1 or 2 to sort : ");
			sort_choice = input.nextInt();
			if (sort_choice != 1 && sort_choice != 2) break;
			String l_choice = (sort_choice == 1? "Ascending": "Descending");
			
			System.out.println();
			System.out.println("The Array values entered before sorting - ");
			System.out.println("-------------------------------------------");
			for (int i : l_Array) {
				System.out.print(i + "\t");
			}
			SortArray obj = new SortArray();
			SortedArray = obj.SortArrayMethod(l_Array, sort_choice);
			System.out.println();
			System.out.println();
			System.out.println("The Array values after sorting in - " + l_choice + " order");
			System.out.println("----------------------------------------------------------------");
			for (int i : SortedArray) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("End of Program");
		System.out.println("--------------");
		input.close();
	}
	
	public int [] SortArrayMethod(int Arr[], int sortoption) {
		int temp_value = 0;
		boolean l_found = false;		
		do { 
			l_found = false;
			for (int j=0; j < Arr.length-1; j++) {
				temp_value = Arr[j];
				if (((temp_value > Arr[j+1]) && sortoption == 1) || ((temp_value < Arr[j+1]) && sortoption == 2)){
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp_value;
					l_found = true;
				}
			}
			
		} while (l_found);
		return Arr;				
	}
}
