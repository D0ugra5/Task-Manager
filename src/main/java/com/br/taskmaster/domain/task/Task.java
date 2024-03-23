package com.br.taskmaster.domain.task;


import com.br.taskmaster.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTask;
    private String title;
    private String description;
    private Boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
