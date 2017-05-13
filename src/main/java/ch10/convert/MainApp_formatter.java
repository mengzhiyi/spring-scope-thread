package ch10.convert;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * formatter
 * @author e593274
 *
 */
public class MainApp_formatter {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch10/convert/Beans_formatter.xml");
//        Team obj = (Team) context.getBean("t");
//        System.out.println(obj.getNames());
//        System.out.println(obj.getMemberCount());
//        System.out.println(obj.getCreateDate());
        Member m = (Member) context.getBean("viceLeader");
        System.out.println(m.getName());
        byte [] bs = m.getCode();
        System.out.println(bs.length);
        for(int i=0; i<bs.length; i++){
        	System.out.println("\t" + bs[i]);
        }
    }
}
