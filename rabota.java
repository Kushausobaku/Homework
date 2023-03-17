package gdz;

import java.util.Scanner;
public class rabota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("text some digits to this field");
		int some = scan.nextInt();
		int a;
		a = some/10000;
		int b;
		b = some%10000/1000;
		int c;
		c = some%1000/100;
		int d;
		d = some%100/10;
		int f;
		f = some%10/1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		

	}

}
