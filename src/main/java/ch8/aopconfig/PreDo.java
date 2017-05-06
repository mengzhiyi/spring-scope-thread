package ch8.aopconfig;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;

@Service
public class PreDo  {

    public String toPre(JoinPoint point) {
        System.out.println(point.getArgs()[0]);
        System.out.println("洗手");
        return "洗手";
    }

}