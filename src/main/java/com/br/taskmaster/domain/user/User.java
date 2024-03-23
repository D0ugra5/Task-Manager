package com.br.taskmaster.domain.user;


import com.br.taskmaster.domain.task.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
@Data
@ToString
public class User {

    @Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUSer;
    private String cpf;
    private String name;
    private String password;
    private String email;
    private String phone;


    @ManyToOne
    @JoinColumn(name = "idTask")
    private Task task;
}
