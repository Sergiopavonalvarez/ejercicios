package holamundo;

public class equalsStrings {

	public static void main(String[] args) {

		String first = "uda";
		String second = "city";
		String firstAndsecond = first + second;
		String third = "udacity";

		if (firstAndsecond.equalsIgnoreCase(third)) {
			System.out.println("they are the same");

		}

		else {

			System.out.println("firstAndsecond is " + firstAndsecond);
		}
	}

}
