package corefunctionalprogram;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int no = sc.nextInt();
		sc.close();
		while (no % 2 == 0) {
			System.out.print(2 + " ");
			no = no / 2;
		}
		for (int i = 3; i * i <= no; i=i+2) {
			System.out.print(i + " ");
			no = no / i;
		}
		if (no > 2) {
			System.out.print(no + " ");
		}
	}
}
