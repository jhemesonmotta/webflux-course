package br.com.jhemeson.webfluxcourse.service;

import br.com.jhemeson.webfluxcourse.entity.User;
import br.com.jhemeson.webfluxcourse.mapper.UserMapper;
import br.com.jhemeson.webfluxcourse.model.request.UserRequest;
import br.com.jhemeson.webfluxcourse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    public Mono<User> save(final UserRequest request){
        return repository.save(userMapper.toEntity(request));
    }
}
