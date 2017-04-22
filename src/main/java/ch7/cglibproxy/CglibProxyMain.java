package ch7.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyMain {

	public static void main(String[] args) {
		DBQuery query = createProxy(new DBQuery());
		System.out.println(query.request("1"));
		System.out.println(query.getClass());
	}

	@SuppressWarnings("unchecked")
	public static <T> T createProxy(Object obj) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(new DBQueryInterceptor(obj));
		return (T) enhancer.create();
	}
}
