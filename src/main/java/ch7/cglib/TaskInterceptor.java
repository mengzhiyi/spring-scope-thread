package ch7.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TaskInterceptor implements MethodInterceptor {

	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println(">>>MethodInterceptor start...");
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println(">>>MethodInterceptor ending...");
		return result;
	}
}
