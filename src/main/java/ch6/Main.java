package ch6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:ch6/Beans.xml");
		System.out.println(context.getBean(HelloWorld.class));
		context.getBean(HelloWorld.class).getMessage();
		System.out.println(context.getBean(HelloWorld.class));
	}	
}
