package corefunctionalprogram;

import java.io.IOException;
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year to Check : ");
		int year = sc.nextInt();
		sc.close();
		
		try {
			if (year < 1000 || year > 9999) {
				throw new IOException();
			}
			
		} catch (IOException ex) {
			System.out.println("!!..Enter a Valid 4-digit Year..!!");
			System.out.println(year + " is NOT a Leap Year...!");
			return;

		}
		
		boolean isLeap = (year % 4 == 0 || year % 100 == 0 || year % 400 == 0);
		if (isLeap) {
			System.out.println(year + " is a Leap Year..");
		} else {
			System.out.println(year + " is Not a Leap Year...!!");
		}
	}
}
