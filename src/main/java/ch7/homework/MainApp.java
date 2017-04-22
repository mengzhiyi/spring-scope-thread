package ch7.homework;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch7.homework.query.DBQuery;
import ch7.homework.query.FileQuery;
import ch7.homework.query.MemoryQuery;

/**
 * placeholder
 * @author e593274
 *
 */
public class MainApp {
    public static void main(String[] args) {
    	
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch7/homework/Beans.xml");
        DBQuery db =  context.getBean(DBQuery.class);
        db.request("db");
        
        FileQuery file = context.getBean(FileQuery.class);
        file.request("file");
        
        MemoryQuery memory = context.getBean(MemoryQuery.class);
        memory.request("memory");
        
        HelloWorld hello = context.getBean(HelloWorld.class);
        hello.getMessage();
        
    }
}
