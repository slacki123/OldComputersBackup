package junitGarage;

public abstract class Vehicle {
	
	private int id;
	private String manufacturer;
	private int mileage;
	
	public Vehicle(int id, String manufacturer, int mileage) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.mileage = mileage;
	}
	
	public int calculateBill() {
		int price = 0;
		if(manufacturer.equals("ferrari")) {
			price = 100;
		}
		return price;
		
	}
	
	

}
