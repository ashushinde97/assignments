package StreamApi;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class City {
	String name;
	int population;
	int area;

	

	public City(String name, int population, int area) {
		this.name = name;
		this.population = population;
		this.area = area;
	}



	public static void main(String[] args) {
		
		ArrayList<City> city = new ArrayList<>();
		city.add(new City("pune",20000,15000));
		city.add(new City("Mumbai",25000,14000));
		city.add(new City("chennai",23000,11000));
		city.add(new City("banglor",23000,11000));
		city.add(new City("haydrabad",23000,11000));
		
		City objItem = city.stream().max((obj1,obj2)-> obj1.population>obj2.population ? 1:-1).get(); 
		System.out.println(objItem.name);
		
		
		Set<Integer> nameSet = city.stream().map(e->e.population).collect(Collectors.toSet());
		System.out.println(nameSet);
		
		
		City minarea = city.stream().min((obj1,obj2)-> obj1.area>obj2.area ? 1:-1).get(); 
		System.out.println(minarea.name);
		

	}

}
