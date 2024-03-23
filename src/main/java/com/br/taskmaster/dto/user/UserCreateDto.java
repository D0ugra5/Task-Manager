package com.br.taskmaster.dto.user;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserCreateDto {
    @NotBlank(message = "O campo nome é obrigatório")
    private String name;

    @Email(message = "O campo email é inválido")
    @NotBlank(message = "O campo email é obrigatório")
    private String email;
    @NotBlank(message = "O campo senha é obrigatório")
    private String password;

    @CPF(message = "O campo cpf é inválido")
    @NotBlank(message = "O campo cpf é obrigatório")
    private String cpf;

}
