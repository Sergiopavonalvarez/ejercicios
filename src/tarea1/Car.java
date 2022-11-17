package tarea1;

public class Car {

	private double milesDriven;
	private double gasInTank;
	private double milesPerGallon;

	


	public void drive(double distance) {
		milesDriven = milesDriven + distance;
		double gasConsumed=distance/milesPerGallon;
		gasInTank=gasInTank-gasConsumed;
	}

	public void addGas(double amount) {

		milesDriven = gasInTank + amount;
	}

	public Car(double mpg) {

		milesDriven = 20;
		gasInTank = 30;
		milesPerGallon = mpg;

	}
	

}


