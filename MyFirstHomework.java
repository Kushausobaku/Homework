package first;

import java.util.Scanner;

public class MyFirstHomework {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.println("Input five digits in this field");
		int input = u.nextInt();
		int a = input / 10000;
		int b = input % 10000 / 1000;
		int c = input % 1000 / 100;
		int d = input % 100 / 10;
		int f = input % 10 / 1;

		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + f);
	}

}
