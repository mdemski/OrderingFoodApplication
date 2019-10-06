package pl.mdemski.services;

import org.springframework.stereotype.Service;
import pl.mdemski.model.User;
import pl.mdemski.repositories.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

}
