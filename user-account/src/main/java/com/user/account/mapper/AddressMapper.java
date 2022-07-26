package com.user.account.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.user.account.dto.AddressDto;
import com.user.account.entity.Address;

@Mapper(componentModel = "spring")
@Component
public interface AddressMapper {
	
	    Address addressDtotoEntity(AddressDto addressdto);
	    
	    AddressDto addressToDto(Address address);

}
