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

/*
 * BeanCreationException - <constructor-args><constructor-args> [constructor
 * arguments specified but no matching constructor found]
 */

/*
 * NoSuchBeanDefinitionException - bean name is un available
 */

/*
 * BeanDefinitionParsingException - empty <constructor-args><constructor-args>
 */

/*
 * UnsatisfiedDependencyException: Error Unsatisfied dependency expressed
 * through constructor argument with index 0 of type [int]: Could not convert
 * constructor argument value of type [java.lang.String] to required type [int]:
 * Failed to convert value of type 'java.lang.String' to required type 'int';
 */

/* IllegalStateException: No bean class specified on bean definition */

/*
 * CannotLoadBeanClassException : Cannot find class [com.javatpoint.Question]
 * for bean with name 'map-001' defined in class path resource
 */