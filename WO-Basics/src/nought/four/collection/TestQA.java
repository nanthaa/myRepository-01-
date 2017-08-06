package nought.four.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQA
{
	public static void main(String[] args)
	{
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Question q = (Question) apc.getBean("que-001");
		q.displayAnswers();
	}
}
