package com.telran.phonebookapi.dto;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
public class NewPasswordDtoAuth {
    @NotBlank
    @Size(max = 20, min = 8, message = "The password is shorter than {min} or longer than {max}")
    public String password;
}
