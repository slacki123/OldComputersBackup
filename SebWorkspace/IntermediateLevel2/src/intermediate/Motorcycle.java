package intermediate;

class Motorcycle extends Vehicle {
	
	String type;
	int mileage;
	
	public Motorcycle(int id, int age, String manufacturer, String type, int mileage) {
		super(age, id, manufacturer);
		this.type = type;
		this.mileage = mileage;
	}
	
}
