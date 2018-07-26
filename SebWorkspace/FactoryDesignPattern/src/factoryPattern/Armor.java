package factoryPattern;

public class Armor extends MapObject {
	
	private int armorPoints;
	private int weight;
	
	public Armor(String name, int armorPoints, int weight){
		super(name);
		this.armorPoints = armorPoints;
		this.weight = weight;
	}
	
	public String getAttribute() {
		return "This armor has " + armorPoints 
				+ " armor points and weighs " 
				+ weight + "kg";
	}

}
