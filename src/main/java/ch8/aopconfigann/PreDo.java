package ch8.aopconfigann;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PreDo  {
	@Pointcut("execution(public * geym.dg.ch8.aopconfigann.ToDo.toEat(..))")
	public void toDoPoint(){}

	@Before("toDoPoint()")
    public String toPre(JoinPoint point) {
        System.out.println("参数:"+point.getArgs()[0]);
        System.out.println("洗手");
        return "洗手";
    }
}