package ch10.valid;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class ControllerSimulator {
    @Autowired
    private Validator validator;
    
    private PersonForm pf=null;

    public Validator getValidator() {
        return validator;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    public PersonForm getPf() {
        return pf;
    }

    public void setPf(PersonForm pf) {
        this.pf = pf;
    }

    public boolean validate(Class<?>... groups){
        Set<ConstraintViolation<PersonForm>> v=validator.validate(pf,groups);
        System.out.println(v);
        return v.size()==0?true:false;
    }
    

    public void setAge(@Min(0) int age){
        pf.setAge(age);
    }
}
