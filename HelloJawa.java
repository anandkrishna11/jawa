package jawaprg;

import java.util.Scanner;

public class HelloJawa {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		System.out.println("The number:"+number);
	}
}
