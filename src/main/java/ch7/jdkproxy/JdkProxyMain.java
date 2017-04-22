package ch7.jdkproxy;

public class JdkProxyMain {
	public static void main(String[] args) {
		DBQueryProxy proxy = new DBQueryProxy();
		IDBQuery qeury = (IDBQuery)proxy.bind(new DBQuery());
		System.out.println(qeury.request("1"));
		System.out.println("class of qeury:"+qeury.getClass());
	}
}
