package one.one.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args)
	{
		String files[] = new String[] { "resorces/car.xml", "resorces/engine.xml" };
		String fileName = "resorces/car-engine.xml";
		ApplicationContext apc = new ClassPathXmlApplicationContext(fileName);
		Car c = (Car) apc.getBean("c");
		c.printData();
	}
}
