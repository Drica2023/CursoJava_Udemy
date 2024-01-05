package projeto.spring.dio.service.Impl;

import org.springframework.stereotype.Service;
import projeto.spring.dio.model.User;
import projeto.spring.dio.repository.UserRepository;
import projeto.spring.dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) throws NoSuchFieldException {
    return userRepository.findById(id).orElseThrow(NoSuchFieldException::new);

    }
    @Override
    public User create(User userToCreate){
        if(userToCreate.getAccount() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("usuario ja existe!!!");
        }
        return userRepository.save(userToCreate);

    }

}
