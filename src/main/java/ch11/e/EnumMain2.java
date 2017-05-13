package ch11.e;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EnumMain2 {
	public static void main(String[] args) {
		final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"geym/dg/ch11/e/Beans2.xml");
		System.out.println(context.getBean(Car.class).getColorEnum());
	}
}
