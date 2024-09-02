package corefunctionalprogram;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of times to Flip the Coin : ");
		int numFlip = sc.nextInt();
		sc.close();
		if (numFlip <= 0) {
			System.out.println("Number of Flip Coin Must be Positive ..");
			return;
		}
		int heads = 0;
		int tails = 0;

		for (int i = 0; i < numFlip; i++) {
			if (Math.random() < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}

		double headsPrct = (double) heads / numFlip * 100;
		double tailsPrct = (double) tails / numFlip * 100;

		System.out.println("Heads Percentage : " + headsPrct + "%");
		System.out.println("Tails Percentage : " + tailsPrct + "%");
	}
}
