package day4;

import java.util.Scanner;

public class MyReserveString {

	public static String[] reverseArray(String[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements of array :");
		int length = input.nextInt();
		String arr[] = new String[length];
		System.out.println("Enter Array of Strings :");
		for (int i = 0; i < length; i++) {
			arr[i] = input.next();
		}
		// Display an original array
		System.out.println("Display the original array :");
		for (String temp : arr) {
			System.out.print(temp + " ");
			
		}
		System.out.println();
		reverseArray(arr);
		// Display an reserved array
		System.out.println("Display the reserved array :");
		for (String temp : arr) {
			System.out.print(temp + " ");
		}

	}
}
