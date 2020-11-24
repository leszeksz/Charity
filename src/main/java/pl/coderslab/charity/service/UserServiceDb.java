package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.User;
import pl.coderslab.charity.repository.UserRepository;

@Service
public class UserServiceDb implements UserService{

    UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
