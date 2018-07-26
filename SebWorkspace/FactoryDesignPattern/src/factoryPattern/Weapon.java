package factoryPattern;

public class Weapon extends MapObject {
	
	private int atkDamage;
	
	public Weapon(String name, int atkDamage) {
		super(name);
		this.atkDamage = atkDamage;
	}
	

	public String getAttribute() {
		return "This weapon has attack damage of: " 
	+ atkDamage;
	}
}
