package ch11.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"" +
                "classpath:geym/dg/ch11/aop/spring-config.xml", "geym/dg/ch11/aop/other-config.xml"});

        HelloService myBean = ctx.getBean("myBean", HelloService.class);
        myBean.sayHello();
    }
}
