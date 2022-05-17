// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class Scan_read {
	public static void main(String args[])
	{
		// Using Scanner for Getting Input from User
		Scanner inp = new Scanner(System.in);

		String s = inp.nextLine();
		System.out.println("You entered string " + s);

		int a = inp.nextInt();
		System.out.println("You entered integer " + a);

		float b = inp.nextFloat();
		System.out.println("You entered float " + b);
	}
}
