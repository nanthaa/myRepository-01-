package nought.three.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObject
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("cio-001");
		emp.show();

		Address add = (Address) context.getBean("cio-000");
		System.out.println(add.toString());
	}

}
