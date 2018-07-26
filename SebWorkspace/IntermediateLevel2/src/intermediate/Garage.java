package intermediate;

import java.awt.List;
import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void returnPrices() {
		for (Vehicle temp : vehicles) {
			if (temp.getClass().getName().equals("intermediate.Car")) {
				Car tem = (Car) temp;
				// If mileage for the car is more than 10000 then make the cost lower
				if (tem.mileage > 10000)
					System.out.println("This Car costs £6 " + temp.manufacturer + " id: " + tem.id);
				else {
					System.out.println("This Car costs £10 " + temp.manufacturer + "id: " + temp.id);
				}
			}
			if (temp.getClass().getName().equals("intermediate.Motorcycle"))
				System.out.println("This Motorcycle costs £7 " + temp.manufacturer + "id: " + temp.id);
			if (temp.getClass().getName().equals("intermediate.Helicopter"))
				System.out.println("This Helicopter costs £20 " + temp.manufacturer + "id: " + temp.id);
		}
	}

	public void addVehicle(Vehicle obj) {
		vehicles.add(obj);
		int id = vehicles.size() + 1; //Automatically increment id by 1 every time a vehicle is added, optional
	}

	public void removeVehicle(Vehicle obj) {
		vehicles.remove(obj);
	}

	private int calculateBillbyId(int id) {
		for (Vehicle temp : vehicles) {
			if (temp.id == id) {
				Car tem = (Car) temp;
				if (temp instanceof Car) {
					if (tem.mileage > 10000)
						return 6;
					else
						return 10;
				}

				if (temp instanceof Motorcycle) {
					return 7;
				}
				if (temp instanceof Helicopter) {
					return 20;
				}
			}
		}
		return 0;

	}

	// bill simplification
	public void bill(int a) {
		System.out.println("You have selected id '" + a + "' for purchase. Your bill is £" + calculateBillbyId(a) + ".");
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}

}

// public int calculatePrice(Vehicle object) {
//
// //iterate through vehicles
//
// for(Vehicle temp : vehicles) {
// Vehicle.class.equals(Car.class);
// Double price = 10.5;
// }
//
// //if object == motorcycle then price = y
//
// // if object == helicopter then price = z
//
// return "The price of this vehicle is: £"+ price;
// }
