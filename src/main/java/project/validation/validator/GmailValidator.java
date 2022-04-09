package project.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import project.validation.annotation.GmailEmailCheck;

public class GmailValidator implements ConstraintValidator<GmailEmailCheck, String>{
    
    @Override
    public void initialize(GmailEmailCheck constraintAnnotation) {

    }
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.toLowerCase().endsWith("@gmail.com");
    }
}