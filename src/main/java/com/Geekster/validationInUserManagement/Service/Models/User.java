package com.Geekster.validationInUserManagement.Service.Models;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
public class User {
    @NotBlank
        @NotEmpty
        private String UserId;
    @NotBlank
        @NotNull
        private String UserName;
        @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String DateOfBirth;

        @Email
        private String Email;

        private  String Address;

        @Size(min = 10,max = 12)
        @Pattern(regexp = "[0-9]+")
        private String PhoneNumber;

    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
        private String Date;
       @Pattern(regexp = "\\d\\d:[0-9]+")
        private String Time;

}
