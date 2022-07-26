package com.user.account.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.user.account.dto.UserDto;
import com.user.account.entity.User;

@Mapper(componentModel = "spring")
@Component
public interface  UserMapper {

	User userDTOtoUser(UserDto userdto);
    
     UserDto userDtoToEntity(User user);
    
  

}
