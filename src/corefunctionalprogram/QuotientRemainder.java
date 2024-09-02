package corefunctionalprogram;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Devidend : ");
		int devidend = sc.nextInt();
		System.out.println("Enter the Divisor : ");
		int divisor = sc.nextInt();
		sc.close();
		if (divisor == 0) {
			System.out.println("Divisor Cannot be Zero : ");
		}
		int quotient = devidend / divisor;
		int remainder = devidend % divisor;
		System.out.println("Quotient : " + quotient);
		System.out.println("Remainder : " + remainder);
	}
}
