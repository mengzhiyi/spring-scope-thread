package ch10.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

public class MemberListConverter implements Converter<String, List<Member>> {

    @Override
    public List<Member> convert(String source) {
    	List<Member> memberList = new ArrayList<Member>();
    	String [] arr = source.split(",");
    	for(String s : arr){
    		 Member m=new Member();
    	     m.setName(s);
    	     memberList.add(m);
    	}
       
        return memberList;
    }

}
