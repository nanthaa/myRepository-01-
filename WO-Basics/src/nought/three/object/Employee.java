package nought.three.object;

public class Employee
{
	int id;
	String name;
	Address address;// dependent Object or Aggregation

	public Employee()
	{
		System.out.println("def cons");
	}

	public Employee(int id, String name, Address address)
	{
		//super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show()
	{
		System.out.println(id + " -- " + name);
		System.out.println(address.toString());
	}
}
