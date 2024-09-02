package corefunctionalprogram;

public class FindLargest {

	public static void main(String[] args) {
		int n1 = 90;
		int n2 = 90;
		int n3 = 90;
		int a = n1 > n2 ? n1 : n2;
		int b = n2 > n3 ? n2 : n3;
		if (a > b) {
			System.out.println(a + " is Greatest Among Three Numbers..");
		} else if (b > a) {
			System.out.println(b + " is Greatest Among Three NUmber...");
		} else {
			System.out.println("All Numbers are Equal ...");
		}
	}

}
