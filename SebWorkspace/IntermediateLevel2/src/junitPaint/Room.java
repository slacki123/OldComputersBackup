package junitPaint;


public class Room {
	
	private int wallLength;
	private int wallHeight;
	
	public Room(int wallLength, int wallHeight) {
		this.wallLength = wallLength;
		this.wallHeight = wallHeight;
	}
	
	public int getLength() {
		return wallLength;
	}
	
	public void setLength(int length) {
		wallLength = length;
	}
	
	public double wallArea() {
		double area = wallLength*wallHeight;
		return area;
	}
	

}

