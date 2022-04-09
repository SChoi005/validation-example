package project.entity;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import project.validation.annotation.GmailEmailCheck;

@Data
public class User{

    private Long id;
    
    @NotBlank(message = "Not Blank")
    @NotNull(message = "Required value.")
    private String name;
    
    @NotBlank(message = "Not Blank")
    @NotNull(message = "Required value.")
    private String password;

    @Positive(message = "The age must be positive.")
    @NotNull(message = "Required value.")
    private int age;
    
    @GmailEmailCheck(message="Not gmail.")
    @Email(message = "Not proper email form.")
    @NotNull(message = "Required value.")
    private String email;
    
    @Pattern(regexp = "^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$", message = "Not proper phone number form.")
    @NotNull(message = "Required value.")    
    private String phoneNumber;

    @NotBlank(message = "Not Blank")
    @NotNull(message = "Required value.")
    private String address;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "Birthday value cannot be future.")
    private LocalDate birthday;
    
}