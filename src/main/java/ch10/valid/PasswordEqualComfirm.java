package ch10.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordEqualComfirm implements ConstraintValidator<PasswordsEqualConstraint,PersonForm>{

    @Override
    public void initialize(PasswordsEqualConstraint constraintAnnotation) {
        
        
    }

    @Override
    public boolean isValid(PersonForm value, ConstraintValidatorContext context) {
        if(value.getPassword()!=null && value.getPassword().equals(value.getRepeartPassword()))
        return true;
        else
            return false;
    }

}
