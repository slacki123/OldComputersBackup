package junitGarage;

public class Helicopter extends Vehicle{
	
	private int numberOfBlades;
	private int maxLoad;

	public Helicopter(int id, String manufacturer, int mileage, int numberOfBlades, int maxLoad) {
		super(id, manufacturer, mileage);
		this.numberOfBlades = numberOfBlades;
		this.maxLoad = maxLoad;
		
	}

}
