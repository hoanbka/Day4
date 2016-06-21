package day4;

import java.util.Scanner;

public class MaxMinArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements of the array :");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Array : [");
		for (int temp : arr) {
			System.out.print(temp + " ");
		}
		System.out.println("]");
		int max = arr[0];
		int min = arr[0];
		int tmax = 0;
		int tmin = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				tmax = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				tmin = i;
			}
		}
		System.out.println("Max : " + max + " at index " + tmax);
		System.out.println("Min : " + min + " at index " + tmin);

	}

}
