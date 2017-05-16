package ch11.methodreplace;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * look-up method and replacer
 * 
 * @author e593274
 *
 */
public class MainMethod2 {
	public static void main(String[] args) {
		final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"ch11/methodreplace/Beans.xml");
		CommandManager m = context.getBean("commandManager", CommandManager.class);
		for (int i = 0; i < 5; i++) {
			m.process();
		}

		context.close();
	}
}
