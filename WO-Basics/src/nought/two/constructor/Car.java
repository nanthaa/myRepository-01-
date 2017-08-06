package nought.two.constructor;

public class Car
{
	int id;
	String name;

	public Car()
	{
		System.out.println("Car is Running before Instantiate Id :" + this.id + " Car Name : " + name);
	}

	public Car(int id)
	{
		this.id = id;
	}

	public Car(String name)
	{
		this.name = name;
	}

	public Car(String name, int id)
	{
		this.id = id;
		this.name = name;
	}

	void show()
	{
		System.out.println("Car id : " + id + " Car Name : " + name);
	}
}
