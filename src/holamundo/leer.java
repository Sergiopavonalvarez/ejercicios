package holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String nombre;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
			
			

		System.out.println("Escribe tu nombre: ");
		nombre=br.readLine();
		System.out.println("Hola " + nombre + " como estas?");
	}

}
