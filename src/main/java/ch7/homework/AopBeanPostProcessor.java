package ch7.homework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import net.sf.cglib.proxy.Enhancer;

public class AopBeanPostProcessor implements BeanPostProcessor {

	private String classNameRegex;
	public void setClassNameRegex(String classNameRegex) {
		this.classNameRegex = classNameRegex;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//使用正则表达式过滤beanName,如果符合要求，则使用动态代理enhance bean
		if(beanName.matches(classNameRegex)){
			return createProxy(bean);
		}
		
		return bean;
	}

	@SuppressWarnings("unchecked")
	public static <T> T createProxy(Object obj) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new QueryInterceptor(obj));
		return (T) enhancer.create();
	}

}
