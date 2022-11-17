package holamundo;

import java.util.Scanner;

public class condicional1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("numero del uno al nueve: ");
		int numero = sc.nextInt();

		if (numero <= 3) {

			System.out.println("el color es azul");
		} else if (numero <= 6) {

			System.out.println("el color es blanco");
		} else {

			System.out.println("es rojo");
		}

	}

}
