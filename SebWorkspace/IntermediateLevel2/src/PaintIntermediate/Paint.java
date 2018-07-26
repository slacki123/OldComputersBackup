package PaintIntermediate;

import java.util.ArrayList;
import java.util.Collections;

public class Paint {

	private String brand;
	private double areaPerLitre;
	private double cost;
	private double volume;
	static ArrayList<Double> wastageList = new ArrayList<Double>();
	static ArrayList<Double> priceList = new ArrayList<Double>();

	public Paint(String brand, double areaPerLitre, double cost, double volume) {
		this.brand = brand;
		this.areaPerLitre = areaPerLitre;
		this.cost = cost;
		this.volume = volume;
	}

	// Setters and Getters

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setCoverage(double areaPerLitre) {
		this.areaPerLitre = areaPerLitre;
	}

	public double getCoverage() {
		return areaPerLitre;
	}

	// Methods

	// Paint unused for a given room
	public double wastage(Room roomWallArea) {
		return areaPerLitre * volume - roomWallArea.wallArea();
	}

	// Calculating cost per unit area
	public double paintingAreaPrice() {
		return cost / (areaPerLitre * volume);

	}

	@Override
	public String toString() {
		return brand;
	}

	public static double outputMinWaste(ArrayList<Paint> PaintList, Room room) {
		for (int i = 0; i < PaintList.size(); i++) {
			wastageList.add(PaintList.get(i).wastage(room));
		}

		System.out.println("Brand wasting the least paint for a given room is *"
				+ PaintList.get(wastageList.indexOf(Collections.min(wastageList))) + "* which \nleaves only "
				+ Collections.min(wastageList)
				+ " m2 area worth of spare paint for a 2m high room with total wall length of " + room.getLength()
				+ " m2");
		
		return Collections.min(wastageList);
		
	}
	
	public static double outputMinCost(ArrayList<Paint> paintList) {
		for (Paint a : paintList) {
			priceList.add(a.paintingAreaPrice());
		}
		
		System.out.println(" \nMinimum painting cost per area is *"  + paintList.get(priceList.indexOf(Collections.min(priceList))) + "* at £" + Collections.min(priceList) + " per m2");
		return Collections.min(priceList);
	}
	

}
