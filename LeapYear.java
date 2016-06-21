package day4;

import java.util.Scanner;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		if (isLeapYear) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		boolean check = true;
		while (check) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the year :");
			int year = input.nextInt();
			System.out.println(isLeapYear(year));
			System.out.println("Do you want to continue : 1/0");
			String str = input.next();
			if (str.contains("1")) {
				check = true;
			} else
			{
				System.out.println("Thanks for using the program haha");
				check = false;}
		}
	}

}
