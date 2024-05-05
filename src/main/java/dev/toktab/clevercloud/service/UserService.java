package dev.toktab.clevercloud.service;

import dev.toktab.clevercloud.model.User;
import dev.toktab.clevercloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return userRepository.findById(username).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String username, User user) {
        User existingUser = userRepository.findById(username).orElse(null);
        if (existingUser != null) {
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setCreateTime(user.getCreateTime());
            userRepository.save(existingUser);
        }
        return existingUser;
    }

    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }
}
