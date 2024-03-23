package com.br.taskmaster.controller.createUser;

import com.br.taskmaster.dto.user.UserCreateDto;
import com.br.taskmaster.service.user.CreateUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class CreateUserController {

    private final CreateUserService createUserService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@Valid  @RequestBody UserCreateDto userCreateDto){
        System.out.println(userCreateDto.getCpf());
        createUserService.saveUser(userCreateDto);
    }
}
