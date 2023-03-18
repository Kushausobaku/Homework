package first;

import java.util.Scanner;

public class MySecondHomework {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		System.out.println("Input the first side of the triangle");
		int a = scann.nextInt();

		System.out.println("Input the second side of the triangle");
		int b = scann.nextInt();

		System.out.println("Input the third side of the triangle");
		int c = scann.nextInt();

		int r = (a + b + c) / 2;
		double s = Math.sqrt(r * (r - a) * (r - b) * (r - c));

		System.out.println("Your perimeter is " + r + "\n" + "Your squaer is " + s);
		
	}
}
