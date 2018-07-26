package junitGarage;

public class Car extends Vehicle {
	
	private String fuelType;
	private String model;
	
	public Car(int id, String manufacturer, int mileage, String fuelType, String model) {
		super(id, manufacturer, mileage);
		this.fuelType = fuelType;
		this.model = model;
	
	}
	
	

	

}
