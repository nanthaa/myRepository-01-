package com.stringhandling;

import java.io.Serializable;

public class Practice
{

	public static void main(String[] args)
	{
		name("name 1");
		name("name 2");
		StringBuffer s = new StringBuffer("nn");
		name(s);
	}

	static final void name(String name)
	{
		System.out.print("String = ");
		System.out.println(name.concat("Concated"));
		System.out.println(name);
	}

	static final void name(StringBuffer name)
	{
		System.out.print("StringBuffer = ");
		System.out.println(name.append(" append"));
		System.out.println(name);
	}

}
