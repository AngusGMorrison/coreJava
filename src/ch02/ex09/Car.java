package ch02.ex09;

public class Car {
	private int milesDriven = 0;
	private double gallonsOfFuel = 20;
	private double milesPerGallon = 40;
	
	public Car(int gallonsOfFuel, int milesPerGallon) {
		this.gallonsOfFuel = gallonsOfFuel;
		this.milesPerGallon = milesPerGallon;
	}
	
	public Car() {}
	
	public int get_miles_driven() {
		return milesDriven;
	}
	
	public double get_gallonsOfFuel() {
		return gallonsOfFuel;
	}
	
	public double milesPerGallon() {
		return milesPerGallon;
	}
	
	public void drive_miles(int miles) {
		if (miles <= max_range()) {
			milesDriven += miles;
			gallonsOfFuel -= miles / milesPerGallon;
			System.out.println("Drove " + miles + " miles.");
			System.out.println(gallonsOfFuel + " gallons of fuel left.");
		} else {
			milesDriven += max_range();
			System.out.println("Drove " + max_range() + ", then ran out of fuel!");
			gallonsOfFuel = 0;
		}
	}
	
	private double max_range() {
		return milesPerGallon * gallonsOfFuel;
	}
	
	public double refuel(int gallons) {
		gallonsOfFuel += gallons;
		return gallonsOfFuel;
	}
}
