package nought.five.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{

	public static void main(String[] args)
	{
		Resource r = new ClassPathResource("applicationContextMap.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		QuestionMapObject q = (QuestionMapObject) factory.getBean("q");
		q.displayInfo();
	}

}
