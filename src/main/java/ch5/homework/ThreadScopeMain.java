package ch5.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义spring标签
 * @author e593274
 *
 */
public class ThreadScopeMain {

    public static void main(String[] args) {
       final ApplicationContext ctx = new ClassPathXmlApplicationContext("ch5/custns/Beans.xml");
       new Thread(){
    	   public void run(){
    		   Object  t1= ctx.getBean("helloBean");
               System.out.println(t1.hashCode());
               Object  t2= ctx.getBean("helloBean");
               System.out.println(t2.hashCode());
    	   }
       }.start();
        
       new Thread(){
    	   public void run(){
    		   Object  t2= ctx.getBean("helloBean");
    	        System.out.println(t2.hashCode());
    	   }
       }.start(); 
    }
}
