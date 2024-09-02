package corefunctionalprogram;

import java.util.Scanner;

public class CheckAlphabet {
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Alphabet to Ckeck Whether the Vowels Or Cosonant : ");
    char ch = sc.next().charAt(0);
    sc.close();
    if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
    {
    	System.out.println(ch+" is Vowel...");
    }
    else
    {
    	System.out.println(ch+" is Consonant");
    }
}
}
