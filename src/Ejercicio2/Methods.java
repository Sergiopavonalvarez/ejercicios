package Ejercicio2;

/**
 * 
 * @author Sergio Pavon Alvarez
 * 
 */

import java.util.Scanner;

public class Methods {
	public static double number, answer;

	public static void calculateSquare(double number) {

		double answer = (int) Math.sqrt(number);
		System.out.println(answer);
	}

	public static void main(String[] args) {
		Methods Methods = new Methods();
		final Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextDouble();
		Methods.calculateSquare(number);

	}

}
