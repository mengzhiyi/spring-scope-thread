package ch7.postprocessor;

import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

public class DemoBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("helloWorld")){
			Method mMsg = ReflectionUtils.findMethod(bean.getClass(), "setMessage",String.class);
			ReflectionUtils.invokeMethod(mMsg, bean, "Hello World from post proccesor");
		}
		return bean;
	}

}
