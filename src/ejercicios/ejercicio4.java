package ejercicios;

public class ejercicio4 {
	// variable miembro de la clase
	static int numero1 = 50;

	public static void main(String[] args) {
		// variables locales
		int numero2 = 30;
		imprimeValor(numero2);
	}

	public static void imprimeValor(int numero2) {
		System.out.println("LA SUMA ES: " + (numero1 + numero2));
	}
}
