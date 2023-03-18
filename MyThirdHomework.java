package first;

import java.util.Scanner;

public class MyThirdHomework {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("Input the radius of a circle");
		
		double r = scann.nextDouble();
		double length  = 2 * Math.PI * r;
		
		System.out.println("Lenght of your circle is " +length);
	}

}
