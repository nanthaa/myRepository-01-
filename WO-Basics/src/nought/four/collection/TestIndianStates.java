package nought.four.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIndianStates
{

	public static void main(String[] args)
	{
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		((IndianStates) apc.getBean("is-001")).displayCities();

	}

}
