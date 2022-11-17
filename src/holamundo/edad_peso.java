package holamundo;

import java.util.Scanner;

public class edad_peso {
	
	public static void main(String[] args) {
		
	

	
	Scanner a= new Scanner(System.in);
	System.out.print("escribe tu edad ");
	int edad= a.nextInt();
	
	
	System.out.print("Escribe tu peso ");
	double peso= a.nextDouble();
	
	System.out.println("el año que viene tendras " + (edad+1) + " y deberias de pesar " + (peso*0.95) + "kg");
	
	
	
	}
}
