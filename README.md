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
    @DateTimeFormat(pattern = "yyyyMMdd")
    
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

```


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