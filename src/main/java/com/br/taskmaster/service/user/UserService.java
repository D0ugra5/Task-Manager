package com.br.taskmaster.service.user;


import com.br.taskmaster.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User {

    private final UserRepository userRepository;


    public User saveUser(User user){
        return userRepository.save(user);
    }
}
