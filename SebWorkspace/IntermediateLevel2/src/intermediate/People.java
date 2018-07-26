package intermediate;
import java.util.*;

public class People {
	
	private List<Person> people = new ArrayList<>();
	
	public People(List<Person> people) {
		this.people = people;
	}
	
	public Person search(String name) {
		for (Person person : this.people) {
			if (person.name.equals(name)) {
				return person;
			}
		}
		return null;
	}
	
	
}


