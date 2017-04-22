package ch7.objenesis;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;

public class ObjenesisTest {
	public static void main(String[] args) {

		Objenesis objenesis = new ObjenesisStd(); // or ObjenesisSerializer
		ObjectInstantiator<User> thingyInstantiator = objenesis.getInstantiatorOf(User.class);
		User user = thingyInstantiator.newInstance();
		user.setId(1);
		user.setName("geym");

		System.out.println(user.getName());
	}
}
