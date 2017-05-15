package ch11.circularity;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularityMain {
	public static void main(String[] args) {
		final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"ch11/circularity/Beans.xml");
		System.out.println(context.getBean(CircularityA.class));
	}
}
