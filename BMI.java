package day4;

import java.util.Scanner;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean check = true;
		while (check) {
			Scanner input = new Scanner(System.in);
			System.out.println("Plz input your name :");
			String name = input.nextLine();
			System.out.println("Plz input your weight (Kg):");
			double w = input.nextDouble();
			System.out.println("Plz input your hight (m): ");
			double h = input.nextDouble();

			double bmi = w / (h * h);
			System.out.println("BMI index of " + name);
			if (bmi < 18.5) {
				System.out.println(" Thieu can");
			} else if (bmi < 25) {
				System.out.println("Ly tuong");
			} else if (bmi <= 30) {
				System.out.println("Thua can");
			} else
				System.out.println("Beo phi");
			System.out.println("Do you want to continue? (1/0)");
			char c = input.next().charAt(0);
			if (c == '1') {
				check = true;
			} else {
				System.out.println("Thanks for using the program haha");
				check = false;
			}

		}

	}

}
