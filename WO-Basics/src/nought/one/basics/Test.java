package nought.one.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{

	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s0 = (Student) context.getBean("s001");
		s0.displayInfo();

		Student s1 = (Student) beanFactory.getBean("s001");// NoSuchBeanDefinitionException
		s1.displayInfo();

		System.out.println(beanFactory.isPrototype("s001"));
		System.out.println(beanFactory.isSingleton("s001"));

		Student s2 = (Student) beanFactory.getBean("s002");// NoSuchBeanDefinitionException
		s2.displayInfo();

		Student s3 = (Student) beanFactory.getBean("s003");// NoSuchBeanDefinitionException
		s3.displayInfo();

	}

}
