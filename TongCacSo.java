package day4;

import java.util.Scanner;

public class TongCacSo {

	public static void main(String[] args) {
		boolean check = true;
		int tong = 0;
		while (check) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Integer number from keyboard :");
			int i = input.nextInt();
			tong = tong + i;
			// Press 0 to stop entering numbers from keyboard
			if (i == 0) {
				System.out.println("Sum of Integer numbers entered = " + tong);
				check = false;
			}
		}
	}

}
