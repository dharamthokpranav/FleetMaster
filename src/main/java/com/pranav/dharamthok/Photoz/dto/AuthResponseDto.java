package com.pranav.dharamthok.Photoz.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accesstoken;
    private String tokenType = "Bearer ";

    public AuthResponseDto(String accesstoken) {
        this.accesstoken = accesstoken;
    }
}
