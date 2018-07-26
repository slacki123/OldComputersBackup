package factoryPattern;

public class Enemy extends MapObject {
	
	private int hitPoints;
	private int damage;
	
	public Enemy(String name, int hitPoints, int damage) {
		super(name);
		this.hitPoints = hitPoints;
		this.damage = damage;
	}
	
	public String getAttribute() {
		return "This enemy has " + hitPoints 
				+ " hit points and can deal " 
				+ damage +" damage";
	}
	

}
