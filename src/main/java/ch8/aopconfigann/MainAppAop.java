package ch8.aopconfigann;

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
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch8/aopconfigann/Beans.xml");

        IToDo obj = (IToDo)context.getBean("toDo");

        obj.toEat("苹果");

    }
}
