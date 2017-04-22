package ch7.homework;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class QueryInterceptor implements MethodInterceptor {
	Object target;

	public QueryInterceptor(Object target) {
		this.target = target;
	}

	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("Log : " + methodProxy.getSuperName() + " query ID:" + args[0]);
		Object result = methodProxy.invoke(target, args);
		return result;
	}

}
