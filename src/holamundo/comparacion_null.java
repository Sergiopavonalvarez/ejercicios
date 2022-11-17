package holamundo;

import java.util.Scanner;

public class comparacion_null {

	public static void main(String[] args) {
	
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("que dijo el alcalde?");
		String respuesta=sc.nextLine();
		
		if (respuesta.equalsIgnoreCase("no comment")) {
			
			System.out.println("no comentarios");
		}
		else if (respuesta.equalsIgnoreCase("")) {
			System.out.println("nada");
			
		}
		

	}

}
