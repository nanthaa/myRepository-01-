package com.stringhandling;

import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest
{

	@Test
	public void test()
	{
		Demo demo = new Demo();
		assertTrue(demo.compareString("/a", "/a"));
		assertFalse(demo.compareString("/a", "/as"));
	}

	/*
	 * @Test public void testConcatString() { // assertEquals("HelloWorld",
	 * "HelloWorld"); // assertEquals("HelloWorld", "Hello World");
	 * assertEquals((true), true); }
	 */

}
