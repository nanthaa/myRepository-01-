package nought.four.collection;

import java.util.Iterator;
import java.util.List;

public class IndianStates
{
	int id;
	String state;
	List<String> cities;

	public IndianStates(int id, String state, List<String> cities)
	{
		this.id = id;
		this.state = state;
		this.cities = cities;
	}

	void displayCities()
	{
		System.out.println("State ID : " + id + " State Name : " + state);

		Iterator<String> itr = cities.iterator();
		for (String city : cities)
		{
			System.out.println(itr.next());
		}
	}
}
