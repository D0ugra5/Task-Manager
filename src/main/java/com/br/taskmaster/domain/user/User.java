package com.br.taskmaster.domain.user;


import com.br.taskmaster.domain.task.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class Usuario {

    @Id() @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUSer;
    private String cpf;
    private String name;
    private String password;
    private String email;
    private String phone;


    @ManyToOne
    private Task task;
}
