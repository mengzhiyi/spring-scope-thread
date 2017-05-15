package ch11.circularity;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 构造函数循环依赖
 * @author billykinggym
 *
 */
public class CircularityMain2 {
	public static void main(String[] args) {
		final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"ch11/circularity/Beans2.xml");
		System.out.println(context.getBean(CircularityA.class));
	}
}
