package com.pranav.dharamthok.Photoz.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RegisterDto {
    @NotEmpty(message = "Username cannot be empty")
    private  String username;
    @NotEmpty(message = "Password cannot be Empty")
    private String password;
}
