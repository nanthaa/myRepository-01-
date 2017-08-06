package nought.three.object;

public class Address
{
	String city;
	String state;
	String country;

	public Address(String city, String state, String country)
	{
		// super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString()
	{
		return city + " " + state + " " + country;
	}
}
