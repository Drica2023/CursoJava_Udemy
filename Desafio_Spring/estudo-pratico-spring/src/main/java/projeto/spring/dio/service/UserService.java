package projeto.spring.dio.service;

import projeto.spring.dio.model.User;

public interface UserService {
    User findById(Long id) throws NoSuchFieldException;

    User create(User userToCreate);
}
