package holamundo;

public class operadoresyexpresiones {

	public static void main(String[] args) {

		int x = 3;
		int y = 4;
		int xy = 11;
		int cos = 5;

		double a = ((x + 1 * 4) * (2 + y));
		double b = x + y / 2 + xy;
		double c = (4 + cos) / 2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println("division");

		int pennies = 435;
		int dollars = pennies / 10;
		int cent = pennies % 10;
		System.out.println(dollars + "." + cent);
		System.out.println();

		int cay = 3;
		int sara = 4;

		System.out.println(cay + 1 > sara);
		System.out.println(cay + 1 <= sara);
		System.out.println(cay + 1 < sara);
		System.out.println(cay + 1 >= sara);
		System.out.println(cay + 1 == sara);
		System.out.println(cay + 1 != sara);
		System.out.println();
	}
	
	public static void main1(String[] args) {
	
		int m = 2, n = 5;
		m++;
		n--;

		System.out.println("incremento y decremento");
		System.out.println(m);
		System.out.println(++m);
		System.out.println(n);
		System.out.println(--n);
		

	}

}
