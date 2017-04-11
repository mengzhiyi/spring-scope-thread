package ch5.custns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义spring标签
 * @author e593274
 *
 */
public class CustNsMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ch5/custns/Beans.xml");
        Calculator ca=(Calculator)ctx.getBean("cal");
        System.out.println(ca);
    }
}
