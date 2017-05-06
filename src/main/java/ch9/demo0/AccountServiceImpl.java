package ch9.demo0;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by zZ on 2016/5/22.
 */
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	private DataSourceTransactionManager txManager;

	@Override
	public void transfer(final String out, final String in, final Double money) {
		DefaultTransactionDefinition def1 = new DefaultTransactionDefinition();
		def1.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
		def1.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status1 = txManager.getTransaction(def1);

		accountDao.outMoney(out, money);
		// int i = 10 / 0;
		accountDao.inMoney(in, money);

		txManager.commit(status1);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTxManager(DataSourceTransactionManager txManager) {
		this.txManager = txManager;
	}
}
