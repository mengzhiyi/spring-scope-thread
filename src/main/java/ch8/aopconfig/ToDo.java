package ch8.aopconfig;

import org.springframework.stereotype.Service;


@Service
public class ToDo implements IToDo {

    @Override
    public String toEat(String fruite) {
        System.out.println("吃" + fruite);
        return "吃"+fruite;
    }

}
