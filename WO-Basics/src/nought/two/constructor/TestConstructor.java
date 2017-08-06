package nought.two.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestConstructor
{
	public static void main(String[] args)
	{
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Car car01 = (Car) factory.getBean("c001");
		car01.show();

		// Car car02 = (Car) factory.getBean("c000");
		// car02.show();
	}
}
// BeanCreationException - <constructor-args><constructor-args> [constructor
// arguments specified but no matching constructor found]
// NoSuchBeanDefinitionException - bean name is un available
// BeanDefinitionParsingException - empty <constructor-args><constructor-args>