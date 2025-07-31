package pe.edu.vallegrande.ms_water_distribution.application.services;

import pe.edu.vallegrande.ms_water_distribution.domain.models.User;
import pe.edu.vallegrande.ms_water_distribution.infrastructure.dto.request.UserCreateRequest;
import pe.edu.vallegrande.ms_water_distribution.infrastructure.dto.response.UserResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> getAll();
    Flux<User> getAllActive();
    Flux<User> getAllInactive();
    Mono<User> getById(String id);
    Mono<UserResponse> save(UserCreateRequest userRequest);
    Mono<User> update(String id, User user);
    Mono<Void> delete(String id);
    Mono<User> activate(String id);
    Mono<User> desactivate(String id);

}
