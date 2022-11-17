package holamundo;

public class excepciones_comparaciones {

	public static void main(String[] args) {

		double original = 2;
		double root = Math.sqrt(original);
		double rootSquare = root * root;
		final double EPSILON = 1E-12;

		if (Math.abs(rootSquare - original) < EPSILON) {

			System.out.println("They are the same");
		} else {

			System.out.println("rootSquared is " + rootSquare);
		}

	}

}
