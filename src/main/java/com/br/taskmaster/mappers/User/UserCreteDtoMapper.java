package com.br.taskmaster.mappers.User;


import com.br.taskmaster.domain.user.User;
import com.br.taskmaster.dto.user.UserCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserCreteDtoMapper {
    UserCreteDtoMapper INSTANCE = Mappers.getMapper(UserCreteDtoMapper.class);

    User toUser(UserCreateDto userCreateDto);
}
