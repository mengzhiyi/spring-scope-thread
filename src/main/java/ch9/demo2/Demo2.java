package ch9.demo2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch9.ScriptRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ch9/applicationContext2.xml")
public class Demo2 {

	@Resource(name = "transactionProxyFactoryBean")
	private AccountService accountService;

	@Resource
	private DataSource dataSource;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@Before
	public void setup() throws SQLException, FileNotFoundException, IOException{
		Connection conn = dataSource.getConnection();
		ScriptRunner sr = new ScriptRunner(conn,true,false);
		sr.runScript(new FileReader("./src/main/resources/ch9/init.sql"));
		conn.close();
	}

	/**
	 * 在测试本方法前，请先修改jdbc.properties配置文件中的数据库，并按给定的sql语句建表
	 *
	 * 思路：
	 *     1. 采用AOP的方式，通过配置org.springframework.transaction.interceptor.TransactionProxyFactoryBean来管理事务和生成代理
	 *           注入需要代理的业务、事务管理器、事务的属性
	 *     2. 使用生成的代理来执行业务
	 */
	@Test
	public void testTransfer() {
		// 现在是可以正常转账状态，在AccountServiceImpl中解开第10行注释会发生异常，可以测试在异常发生时的事务处理结果
		accountService.transfer("aaa", "bbb", 100d);
		System.out.println("转账正常完成");
	}
}
