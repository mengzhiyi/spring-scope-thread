package ch10.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IpValidator implements ConstraintValidator<Ip, String> {
    @Override
    public void initialize(Ip constraintAnnotation) {
        
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null || "".equals(value.trim())) return false;
        boolean re=false;
        String IP=value.trim();
        if(IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")){  
            String s[] = IP.split("\\.");  
            if(Integer.parseInt(s[0])<255)  
                if(Integer.parseInt(s[1])<255)  
                    if(Integer.parseInt(s[2])<255)  
                        if(Integer.parseInt(s[3])<255)  
                            re = true;  
        }  
        return re; 
    }

}
