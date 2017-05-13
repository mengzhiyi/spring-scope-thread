package ch10.valid;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * validate
 * @author e593274
 *
 */
public class MainAppe {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("geym/dg/ch10/valid/Beans.xml");
        ControllerSimulator obj = context.getBean(ControllerSimulator.class);
        PersonForm pf=new PersonForm("geym", 35);
        pf.setPassword("abc");
        pf.setRepeartPassword("abc");
        pf.setIp("127.0.0.1");
        obj.setPf(pf);
        obj.validate();

        obj.setAge(2);

       // obj.validate(IpGroup.class);
    }
}
