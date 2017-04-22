package ch7.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * placeholder
 * @author e593274
 *
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch7/aop/Beans.xml");
        DBQuery obj =  context.getBean(DBQuery.class);
        String re = obj.request("aaa");
        System.out.println(re);
    }
}
