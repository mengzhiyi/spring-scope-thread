package ch8.proxyfactorybean;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Override
    public void updateUser() {
        System.out.println("$$$$$$执行业务逻辑$$$$$");
    }
}
