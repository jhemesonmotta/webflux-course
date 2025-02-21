package br.com.jhemeson.webfluxcourse.repository;

import br.com.jhemeson.webfluxcourse.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
