package ch8.proxyfactory;

public class UserServiceImpl {//implements UserService{
	private String txId;

    public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}

//	@Override
    public void updateUser() {
        System.out.println(txId+":$$$$$$执行业务逻辑$$$$$");
    }
}
