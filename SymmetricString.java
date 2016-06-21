package day4;

import java.util.Scanner;

public class SymmetricString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string :");
		String str = input.next();
		int length = str.length();
		boolean check = true;
		for (int i = 0; i < length - 1; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				check = false;
				break;
			}
		}
		if (check == false) {
			System.out.println(false);
		} else
			System.out.println(true);

	}

}
