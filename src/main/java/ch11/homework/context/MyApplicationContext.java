package ch11.homework.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext extends ClassPathXmlApplicationContext {
	
	public MyApplicationContext(String... configLocations) throws BeansException {
		this(configLocations, true, null);
	}
	
	public MyApplicationContext(String[] configLocations, boolean refresh, ApplicationContext parent)
			throws BeansException {
		
		super(parent);
		setAllowBeanDefinitionOverriding(false);
		setConfigLocations(configLocations);
		if (refresh) {
			refresh();
		}
	}
}
