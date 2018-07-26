package factoryPattern;

import java.util.Random;

public abstract class MapObject {

	private String name;
	private int yPos;
	private int xPos;
	private Random rand = new Random();

	public MapObject(String name) {
		do {
			xPos = rand.nextInt(6) - 3;
		} while (xPos == 0);
		
		yPos = rand.nextInt(6) - 3;
		this.name = name;
	}
	
	public abstract String getAttribute();
	
	public String getObjectCoordinates() {
		return "This object is located at [" 
	+ this.xPos + "," + this.yPos + "]";
	}
	
	public String getObjectName() {
		return name;
	}

	public double getyPos() {
		return yPos;
	}

	public double getxPos() {
		return xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}



	public void setObjectCoordinates(int yPos, int xPos) {
		this.yPos = yPos;
		this.xPos = xPos;
	}



	public String toString() {
		return name;
	}

}
