package br.com.jhemeson.webfluxcourse.mapper;

import br.com.jhemeson.webfluxcourse.entity.User;
import br.com.jhemeson.webfluxcourse.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);

}

