package ch10.convert;

import org.springframework.core.convert.converter.Converter;

public class MemberConverter implements Converter<String, Member> {

    @Override
    public Member convert(String source) {
        Member m=new Member();
        m.setName(source);
        return m;
    }

}
