package com.stringhandling;

public class Demo
{
	public boolean compareString(String one, String two)
	{
		if (one.equalsIgnoreCase(two))
		{
			System.out.println("equals");
			return true;
		}
		else
		{
			System.out.println("not equals");
			return false;
		}
	}

	public String concatString(String first, String second)
	{
		return first.concat(second);
	}
}
