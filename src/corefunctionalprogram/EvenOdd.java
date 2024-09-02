package corefunctionalprogram;

import java.util.Scanner;

public class EvenOdd {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to Check : ");
	int no=sc.nextInt();
	sc.close();
	if(no%2==0)
	{
		System.out.println(no+" is a Even Number..");
	}
	else
	{
		System.out.println(no+" is Odd Number...");
	}
}
}
