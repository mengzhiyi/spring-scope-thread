package ch10.convert;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MemberFormatter implements Formatter<Member> {

    @Override
    public String print(Member object, Locale locale) {
    	
        return object.getName();        
    }

    @Override
    public Member parse(String text, Locale locale) throws ParseException {
        Member m=new Member();
        m.setName(text);
        return m;
    }

}
