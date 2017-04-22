package ch7.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DBQueryInterceptor implements MethodInterceptor {
	Object target;

	public DBQueryInterceptor(Object target) {
		this.target = target;
	}

	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("query ID:" + args[0]);
		Object result = method.invoke(target, args);
		return result;
	}

}
