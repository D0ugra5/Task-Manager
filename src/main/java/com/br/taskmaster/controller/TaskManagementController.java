package com.br.taskmaster.controller;

import com.br.taskmaster.domain.welcome.WelcomeMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController()
@RequestMapping("task-management")
public class TaskManagementController {


    @GetMapping
    public ResponseEntity instructionManagement (){
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Task Management", LocalDateTime.now());
        return ResponseEntity.ok(welcomeMessage);
    }
}
