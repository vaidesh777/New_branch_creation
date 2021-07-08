package Git_Branches;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		int a, b, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two integers a and b");
		a = sc.nextInt();
		b = sc.nextInt();

		result = a + b;
		System.out.println("addition is=" + result);

	}

}
