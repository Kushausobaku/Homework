package first;

import java.util.Scanner;

public class MyFirstHomework {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.println("Input five digits in this field");
		int input = u.nextInt();
		int a;
		int b;
		int c;
		int d;
		int f;

		a = input / 10000;
		b = input % 10000 / 1000;
		c = input % 1000 / 100;
		d = input % 100 / 10;
		f = input % 10 / 1;

		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + f);
	}

}
