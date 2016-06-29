package day4;

import java.util.Scanner;

public class SymmetricString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your String :");
		String str = input.next();
		int low = 0;
		int hight = str.length() - 1;
		boolean isSymmetric = true;
		while (low < hight) {
			if (str.charAt(low) != str.charAt(hight)) {
				isSymmetric = false;
				break;
			}
			low++;
			hight--;
		}
		System.out.println(isSymmetric);

	}

}
