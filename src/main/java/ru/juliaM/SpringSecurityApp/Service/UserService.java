package ru.juliaM.SpringSecurityApp.Service;

import ru.juliaM.SpringSecurityApp.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByUsername(String username);

    void saveUser(User user);

    void deleteUser(Long id);
}