package tw.kevin;

import java.util.Scanner;

import com.sun.tools.classfile.DefaultAttribute;

public class Brad09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choice a number from 1,2,3,4: ");
		int a = scanner.nextInt();
		
		switch (a) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
			case 4:
				System.out.println("D");
			default:
				System.out.println("please choice the right content.");
				
		}
System.out.println("------------");
				
		}	

	}


