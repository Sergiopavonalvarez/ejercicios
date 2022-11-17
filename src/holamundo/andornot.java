package holamundo;

import java.util.Scanner;

public class andornot {

	public static void main(String[] args) {
		// and &&
		// or ||
		// not !
		
		Scanner cs= new Scanner (System.in);
		
		System.out.println("cordenada x: ");
		int x= cs.nextInt();
		System.out.println("coordenada y: ");
		int y=cs.nextInt();
		
		if (x==3 && y==3 || x!=3 && y==3 ||x==3 && y!=3 ) {
			
			System.out.println("alguno es tres");
		}
		else   {
			System.out.println("no es tres");
		}

	}

}
