package junitPaint;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class PaintTest {

	// Tests for room

	@Test
	public void getLengthTest() {
		Room room = new Room(1, 1);
		assertEquals("the test failed", room.getLength(), 1);
	}

	@Test
	public void setLengthTest() {
		Room room = new Room(1, 1);
		room.setLength(2);
		assertEquals("the test failed", room.getLength(), 2);
	}

	@Test
	public void wallAreaTest() {
		Room room = new Room(1, 2);
		assertEquals("the test failed", room.wallArea(), 2, 0);
	}

	// Tests for paint getters/setters

	@Test
	public void getTinSizeTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		assertEquals("Paint wrong size", 20, cheapoMax.getVolume(), 0);
	}

	@Test
	public void setTinSizeTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		cheapoMax.setVolume(5);
		assertEquals("Paint wrong size", 5, cheapoMax.getVolume(), 0);
	}

	@Test
	public void getTinCostTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		assertEquals("Paint wrong cost", 19.99, cheapoMax.getCost(), 0);
	}

	@Test
	public void setTinCostTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		cheapoMax.setCost(5);
		assertEquals("Paint wrong cost", 5, cheapoMax.getCost(), 0);
	}

	@Test
	public void getTinCoverageTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		assertEquals("Paint wrong coverage", 10, cheapoMax.getCoverage(), 0);
	}

	@Test
	public void setTinCoverageTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		cheapoMax.setCoverage(5);
		assertEquals("Paint wrong coverage", 5, cheapoMax.getCoverage(), 0);
	}

	// Tests for price per area and wastage per given room
	@Test
	public void paintingAreaPriceTest() {
		Paint cheapoMax = new Paint("CheapoMax", 1, 1, 1);
		assertEquals("Paint wrong price per area", 1, cheapoMax.paintingAreaPrice(), 0);
	}

	@Test
	public void wastageTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 5);
		Room room = new Room(5, 2);
		assertEquals("Paint wrong wastage", 40, cheapoMax.wastage(room), 0);
	}

	@Test
	public void getMinWastageTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		Paint averageJoes = new Paint("AverageJoes", 11, 17.99, 15);
		Paint duluxourousPaints = new Paint("DuluxourousPaints", 20, 25, 10);

		Room room = new Room(40, 2);

		ArrayList<Paint> paintList = new ArrayList<Paint>();
		paintList.add(cheapoMax);
		paintList.add(averageJoes);
		paintList.add(duluxourousPaints);
		
		assertEquals("Test Failed",85.0, Paint.outputMinWaste(paintList, room),0);
	}
	
	@Test
	public void getMinPaintingCostTest() {
		Paint cheapoMax = new Paint("CheapoMax", 10, 19.99, 20);
		Paint averageJoes = new Paint("AverageJoes", 11, 17.99, 15);
		Paint duluxourousPaints = new Paint("DuluxourousPaints", 20, 25, 10);

		Room room = new Room(40, 2);

		ArrayList<Paint> paintList = new ArrayList<Paint>();
		paintList.add(cheapoMax);
		paintList.add(averageJoes);
		paintList.add(duluxourousPaints);
		
		assertEquals("Test Failed", 0.09995, Paint.outputMinCost(paintList), 0);
	}
	
	

}
