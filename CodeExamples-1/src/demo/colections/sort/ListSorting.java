package demo.colections.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//public class ListSorting
//{
//
//	public static void main(String[] args)
//	{
//		Vector stringList = new Vector();
//		stringList.add("A");
//		stringList.add("S");
//		stringList.add("L");
//
//		int i = 0;
//		Iterator<String> s = stringList.iterator();
//		while (s.hasNext())
//		{
//			System.out.println(stringList.get(i) + " " + s.next());
//			i++;
//		}
//
//		System.out.println("After sorting");
//
//		stringList.sort(null);
//
//		Iterator<String> s1 = stringList.iterator();
//		while (s1.hasNext())
//		{
//			System.out.println(s1.next());
//		}
//
//	}

class A
{
	static void m() throws IOException
	{
		throw new IOException("S");
	}
}

public class ListSorting
{

	public static void main(String[] args) throws IOException
	{
		long f = 0, l = 0;
		try
		{
			f = System.currentTimeMillis();
			A.m();

		}
		catch (Exception e)
		{
			l = System.currentTimeMillis();
			System.out.println(e.getMessage());
			System.out.println(l - f);

		}
	}
}
