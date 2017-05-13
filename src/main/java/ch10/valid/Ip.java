package ch10.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=IpValidator.class)
public @interface Ip {
    String message() default "{must.an.legal.ip.address}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default {};
}
