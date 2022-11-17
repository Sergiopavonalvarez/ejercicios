package tarea1;

public class coche {

	Integer cilindrada;
	String color;
	double precio;
	boolean isArrancado;

	void arrancar() {
		if (isArrancado != true) {
			isArrancado = true;
			System.out.println("¡¡¡Brrrrrrr!!! El coche acaba de arrancar");

		} else {
			System.out.println("Kisch, kishch!!! El coche ya esta arrancado.");
		}
	}

	void verCoche() {
		System.out.println("este coche es de color" + color + "tiene una cilindrada de " + cilindrada + " y cuesta "
				+ precio + " euros");
		if (isArrancado == true) {
			System.out.println("ahora mismo esta arrancado"); // aqui vemos si esta arrancado si no, se pasa al else
		} else {
			System.out.println("ahora mismo esta parado"); // y vemos que no esta arrancado
		}
	}

	public static void main(String args[]) {
		coche c;
		c = new coche();
		c.cilindrada = 1800;
		c.color = "plata"; // vemos el color
		c.precio = 25000.0; // vemos el precio que tiene
		System.out.println("que coche es este?");
		c.verCoche();
		System.out.println("vamos a arrancar el coche");
		c.arrancar();
		System.out.println("que coche es este?");
		c.verCoche();
		System.out.println("vamos a arrancar el coche");
		c.arrancar();
	}

}
