package holamundo;

import java.io.IOException;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) throws IOException {
		
		char operacion;
		int res=0;
		
		Scanner a=new Scanner (System.in);
		System.out.println("introduce un numero ");
		int numero1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("introduce otro numero ");
		int numero2=b.nextInt();
		
		Scanner c=new Scanner (System.in);
		System.out.println("introduce la operacion: +,-,/,*");
		operacion =(char) System.in.read();; 
		
		switch (operacion) {
		case '+':
			res=numero1+numero2;
			break;
		case '-' :
			res=numero1-numero2;
			break;
		case '*' : 
			res=numero1*numero2;
			break;
		case '/' : 
			res=numero1/numero2;
			break;	
			
			
			
		}
	System.out.println("la operacion es " + res);
		

	}

}
