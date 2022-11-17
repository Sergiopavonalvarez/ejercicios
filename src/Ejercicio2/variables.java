package Ejercicio2;
/**
 * 
 * @author Sergio Pavon Alvarez
 * 
 */
import java.util.Scanner;

class variables {
	public static void main(String args[]) {
		Scanner Scanner = new Scanner(System.in);
		int product;
		System.out.println("Enter the 1st number:");
		int num1 = Scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = Scanner.nextInt();

		product = num1 * num2;
		System.out.println("The product of the two numbers is:" + product);
	}
}
