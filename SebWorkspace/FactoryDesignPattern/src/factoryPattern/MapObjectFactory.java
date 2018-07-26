package factoryPattern;

import java.util.Random;

public class MapObjectFactory {
	
	static Random rand = new Random();
	
	public static MapObject makeMapObject(String object) {
		if(object.equalsIgnoreCase("armor")){
			return new Armor(object, rand.nextInt(10), rand.nextInt(5));
		}
		
		else if (object.equalsIgnoreCase("weapon")) {
			return new Weapon(object, rand.nextInt(7));
		}
		else if (object.equalsIgnoreCase("enemy")) {
			return new Enemy(object, rand.nextInt(10), rand.nextInt(5));
		}
		return null;
	}

}

//optionally random values could be assigned to the constructor instead