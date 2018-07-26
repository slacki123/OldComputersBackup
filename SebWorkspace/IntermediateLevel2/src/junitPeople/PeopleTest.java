package junitPeople;


import static org.junit.Assert.*;

import org.junit.Test;

public class PeopleTest {
	
	@Test
	public void addPeopleTest() {
		Person p1 = new Person("John", 21, "Farmer");
		Person p2 = new Person("Jacob", 22, "Student");
		Person p3 = new Person("Mike", 42, "Actor");
		Person p4 = new Person("Kirsty", 42, "Programmer");
		assertEquals("The people ArrayList has not populated upon instantiation", 6, Person.getArraySize());
	}
	
	@Test
	public void getNameTest() {
		Person p1 = new Person("John", 21, "Farmer");
		assertEquals("Wrong name", "John", p1.getName());
	}

   @Test
   public void searchPersonTest() {
	   Person p1 = new Person("John", 21, "Farmer");
	   assertEquals("Wrong person", "John 21 Farmer", Person.searchPerson("John").toString());

   }
   
   @Test
   public void searchPersonTest2() {
	   assertEquals("Result is not null", null, Person.searchPerson("wrongName"));
   }
   


}
