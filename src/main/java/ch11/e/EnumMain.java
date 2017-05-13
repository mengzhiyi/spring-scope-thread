package ch11.e;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EnumMain {
	public static void main(String[] args) {
		final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"geym/dg/ch11/e/Beans.xml");
		System.out.println(context.getBean(Car.class).getColorEnum());
	}
}
