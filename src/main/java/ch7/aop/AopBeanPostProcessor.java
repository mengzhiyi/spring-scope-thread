package ch7.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import ch7.cglibproxy.DBQueryInterceptor;
import net.sf.cglib.proxy.Enhancer;

public class AopBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().equals(DBQuery.class)) {
			return createProxy(bean);
		}
		return bean;
	}

	@SuppressWarnings("unchecked")
	public static <T> T createProxy(Object obj) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new DBQueryInterceptor(obj));
		return (T) enhancer.create();
	}

}
