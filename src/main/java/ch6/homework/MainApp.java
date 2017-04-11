package ch6.homework;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * placeholder
 * @author e593274
 *
 */
public class MainApp {
    public static void main(String[] args) {
        
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ch6/homework/spring-application.xml");
        DruidDataSource dataSource = (DruidDataSource) context.getBean("dataSource");
        try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
