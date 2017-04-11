package ch6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class PostFactory implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		beanFactory.getBeanDefinition("helloWorld").setScope(BeanDefinition.SCOPE_PROTOTYPE);
		beanFactory.getBeanDefinition("helloWorld").getPropertyValues().add("message", "Hello World");
	}

}
