package nought.five.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap
{

	public static void main(String[] args)
	{
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		QuestionStringString qc = (QuestionStringString) apc.getBean("map-001");
		qc.displayInfo();
	}
}
