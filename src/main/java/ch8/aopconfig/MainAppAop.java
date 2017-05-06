package ch8.aopconfig;

import java.util.Iterator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * AnnotationAwareAspectJAutoProxyCreator  ( <aop:aspectj-autoproxy /> 引起)
 *
 * @author e593274
 *
 */
public class MainAppAop {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch8/aopconfig/Beans.xml");

        IToDo obj = context.getBean(ToDo.class);

        obj.toEat("苹果");

        Iterator<String> names=context.getBeanFactory().getBeanNamesIterator();
        while(names.hasNext()){
        	String beanName = names.next();
        	System.out.println(beanName +":"+ context.getBeanFactory().getBean(beanName).getClass());
        }
    }
}
