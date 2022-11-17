package holamundo;

import java.io.IOException;

public class caracter {

	public static void main(String[] args) throws IOException {

		System.out.println("Elige una opcion: a, b , c ");

		char c = (char) System.in.read();

		System.out.println("la opcion elegida es : " + c);

	}

}
