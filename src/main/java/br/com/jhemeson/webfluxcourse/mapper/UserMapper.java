package br.com.jhemeson.webfluxcourse.mapper;

import br.com.jhemeson.webfluxcourse.entity.User;
import br.com.jhemeson.webfluxcourse.model.request.UserRequest;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(final UserRequest request) {
        return User.builder()
                .name(request.name())
                .email(request.email())
                .password(request.password())
                .build();
    }
}