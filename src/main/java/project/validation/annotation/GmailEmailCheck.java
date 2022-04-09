package project.validation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import project.validation.validator.GmailValidator;

@Target({ElementType.METHOD, ElementType.FIELD}) // target for annotation to apply
@Retention(RetentionPolicy.RUNTIME) 
@Constraint(validatedBy = GmailValidator.class) // setting validator
public @interface GmailEmailCheck{
    
    String message() default "{project.validation.GmailEmailCheck.Pattern.message}";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}