package com.devsuperior.dscatalog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class NewPasswordDTO {

    private String token;

    @NotBlank(message = "Campo obrigatório")
    @Size(min = 8, message = "Deve ter no mínimo 8 caracteres")
    private String password;

    public NewPasswordDTO() {
    }

    public NewPasswordDTO(String token, String password) {
        this.token = token;
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public @NotBlank(message = "Campo obrigatório") @Size(min = 8, message = "Deve ter no mínimo 8 caracteres") String getPassword() {
        return password;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPassword(@NotBlank(message = "Campo obrigatório") @Size(min = 8, message = "Deve ter no mínimo 8 caracteres") String password) {
        this.password = password;
    }
}
