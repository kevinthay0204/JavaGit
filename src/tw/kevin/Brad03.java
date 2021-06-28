package tw.kevin;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Brad03 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert a value (a) = ");
		a = scanner.nextInt();
		System.out.println("insert a value (b) = ");
		b = scanner.nextInt();
		int c = a +b;
		int c1 = a-b;
		int c2 = a*b;
		int c3 = a/b;
		int c4 = a%b;
//		System.out.printf("The sum of a + b = "+ a +" + "+ b +" = "+ c);
		System.out.println(String.format("%d + %d = %d",a,b,c));
		System.out.println(String.format("%d - %d = %d",a,b,c1));
		System.out.println(String.format("%d * %d = %d",a,b,c2));
		System.out.println(String.format("%d / %d = %d...%d",a,b,c3,c4));
		
	
	}

}
