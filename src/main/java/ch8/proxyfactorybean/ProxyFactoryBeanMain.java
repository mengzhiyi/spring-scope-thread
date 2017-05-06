package ch8.proxyfactorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch8/proxyfactorybean/Beans.xml");
		UserService us=(UserService)context.getBean("userService");
		us.updateUser();
	}
}
