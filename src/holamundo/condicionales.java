package holamundo;

import java.util.Scanner;

public class condicionales {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Floor: ");
		int floor = in.nextInt();
		int actualFloor;
		// TODO: Modify the code to calculate the actual floor in
		// a building with neither a 13 or 14 floor
		if (floor > 13) {
			actualFloor = floor - 2;
		} else {
			actualFloor = floor;
		}
		System.out.println("Actual floor: " + actualFloor);
	}
}
