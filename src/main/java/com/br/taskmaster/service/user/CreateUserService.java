package com.br.taskmaster.service.user;


import com.br.taskmaster.domain.user.User;
import com.br.taskmaster.dto.user.UserCreateDto;
import com.br.taskmaster.mappers.User.UserCreteDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService {

        private final UserService userService;

        public User saveUser(UserCreateDto userCreateDto){
            User user = userService.saveUser(UserCreteDtoMapper.INSTANCE.toUser(userCreateDto));
            System.out.println(user);
            return user;
        }
}
