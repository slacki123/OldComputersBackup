package factoryPattern;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		String input = sc.nextLine();

		
//		String input = "armor";
		ArrayList<MapObject> list = new ArrayList<MapObject>();
//		for(int i = 0; i<3; i++) {
		MapObject obj = MapObjectFactory.makeMapObject(input);

		list.add(obj);
		System.out.println(obj.getObjectName());
		System.out.println(obj.getObjectCoordinates());
		System.out.println(obj.getAttribute());
		
		
		
//		for(int j = 0; j<list.size(); j++) {
//			System.out.println(list.get(j));
//		}
//		}
		
	
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		
	}
	

	
	
	
	

}
