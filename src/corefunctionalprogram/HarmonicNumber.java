package corefunctionalprogram;

import java.io.IOException;
import java.util.Scanner;

public class HarmonicNumber {
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Value Of N to Compute the Nth Harmonic : ");
    int N = sc.nextInt();
//    try {
//    	if(N<=0)
//    	{
//    		throw new IOException();
//    	}
//    }
//    catch(IOException ex)
//    {
//    	System.out.println("Enter the Valid Number to Find the Harmonic...");
//    	return;
//    }
    if(N<=0)
    {
    	System.out.println("Please Enter the Number Greater than Zero : ");
    	return;
    }
    System.out.println(N+"th Harmonic Of "+N+" is : "+calculateHarmonic(N));
    
}
public static double calculateHarmonic(int N)
{
	double harmonicNumber = 0.0;
	for(int i=1;i<=N;i++)
	{
		harmonicNumber = harmonicNumber+1.0/i;
	}
	return harmonicNumber;
}
}
