package ch10.convert;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Convertor
 * @author e593274
 *
 */
public class MainApp_convertor {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch10/convert/Beans.xml");
        Team obj = (Team) context.getBean("t");
        System.out.println(obj.getNames());
        System.out.println(obj.getLeader());
        List<Member> members = obj.getMembers();
        System.out.println(members.size());
        for(Member m : members){
        	System.out.println("\t" + m.getName());
        }
    }
}
