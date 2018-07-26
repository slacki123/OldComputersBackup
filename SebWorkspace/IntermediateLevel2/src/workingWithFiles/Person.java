package workingWithFiles;

public class Person {
	
	String name;
	String occupation;
	int age;
	
	public Person(String name, String occupation, int age) {
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
