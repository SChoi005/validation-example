# Validation


## single field validation
```bash
    
    /* javax.validation.constraints */

    @Min, @DecimalMin(value=)	
    @Max, @DecimalMax(value=) 
    @NotNull
    @Null
    @Pattern(regex=)
    @Size(min=,max=)
    @NotBlank
    @NotEmpty
    @Digits(integer=, fraction = )
    @Positive
    @PositiveOrZero
    @Negative
    @NegativeOrZero
    @Email
    @Past
    @Future
    @PastOrPresent
    @AssertFalse
    @AssertTrue
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    
    /* Hibernate annotations */
    compile('org.springframework.boot:spring-boot-starter-validation')
    
    @CreditCardNumber
    @Length
    @Range
    @SafeHtml
    @URL
    
```

## custom validation

```bash

    /*
        @Target => target for annotation to apply
        @Retention => setting for Retention policy
        @Constraint => setting validator
    */

    @Target({ElementType.METHOD, ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME) 
    @Constraint(validatedBy = GmailValidator.class)
    public @interface GmailEmailCheck{
        String message() default "{project.validation.GmailEmailCheck.Pattern.message}";
    
        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};
    }
    
    /*
        ConstraintValidator<annotationName, type>
        Boolean statement is written on Method "isValid".    
    */
    
    public class GmailValidator implements ConstraintValidator<GmailEmailCheck, String>{
    
        @Override
        public void initialize(GmailEmailCheck constraintAnnotation) {

        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            return value.toLowerCase().endsWith("@gmail.com");
        }
    }
    

```
