package holamundo;

public class Conversiones_numeros {

	public static void main(String[] args) {

		 /*byte dato1 = 3;
		short dato2 = 5;

		dato2 = dato1;

		
		System.out.println(dato1); */
		
		double price = 4.35;
		
		//int pennies= (int) (4.35*100); // error por el tipo
		
		int pennies = (int) Math.round(4.35 * 100); //redondear con Math
		
		
		System.out.println(pennies);
		
		/*int idato=5;
		byte bdato;
		bdato=(byte)idato;
		System.out.println(bdato);*/
		
		

	

	}

}
