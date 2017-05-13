package ch11.methodreplace;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CommandManagerReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("replace preHandle method, new preHandle for:"+args[0]);
		return null;
	}

}
