package intermediate;

class Helicopter extends Vehicle {
	
	int numberOfBlades;
	boolean jetEnginePresent;
	
	public Helicopter(int id, int age, String manufacturer, int numberOfBlades, boolean jetEnginePresent) {
		super(age, id, manufacturer);
		this.numberOfBlades = numberOfBlades;
		this.jetEnginePresent = jetEnginePresent;
	}
	
	
	
}

