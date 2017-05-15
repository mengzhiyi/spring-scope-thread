package ch11.homework.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new MyApplicationContext(new String[] {
                "classpath:ch11/homework/Beans2.xml", "classpath:ch11/homework/Beans.xml"}
				);
		
		IHelloWorld helloWorld = (IHelloWorld) context.getBean("helloWorld");
		helloWorld.say();
	}
}
