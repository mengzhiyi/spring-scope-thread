package ch11.aop;

public class HelloService {

    private Target target;

    public void setTarget(final Target target) {
        this.target = target;
    }

    public void sayHello() {
        target.sayHello();
    }
}
