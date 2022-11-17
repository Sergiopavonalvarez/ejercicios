package Ejercicio1;

/**
 * 
 * @author Sergio Pavon
 *
 */

public class temperatura {

	private double C;
	private double F;

	public double celsisusToFarenheit(double celsius) {

		F = 1.8 * celsius + 32;
		return F;

	}

	public double farenheitToCelsius(double Farenheit) {

		C = (Farenheit - 32) / 1.8;
		return C;

	}
	
	

		public static void main(String[] args) {
			temperatura x;
			x = new temperatura();

			System.out.println(x.celsisusToFarenheit(9));
		}

	}


