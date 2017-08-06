package nought.one.basics;

public class Student
{
	private String iName;

	public String getiName()
	{
		return iName;
	}

	public void setiName(String Name)
	{
		this.iName = Name;
	}

	public void displayInfo()
	{
		System.out.println(" Hi , " + iName);
	}
}
