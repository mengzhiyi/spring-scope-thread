package ch8.autoproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author e593274
 *
 */
public class MainAppAop {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch8/autoproxy/Beans.xml");

        IToDo obj = (IToDo)context.getBean("toDo");

        obj.toEat("苹果");

    }
}
