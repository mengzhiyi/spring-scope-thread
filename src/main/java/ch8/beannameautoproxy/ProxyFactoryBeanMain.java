package ch8.beannameautoproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch8/beannameautoproxy/Beans.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		us.updateUser();
	}
}
