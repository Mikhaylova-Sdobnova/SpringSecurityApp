package ru.juliaM.SpringSecurityApp.DAO;

import org.springframework.stereotype.Repository;
import ru.juliaM.SpringSecurityApp.Model.User;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByUsername(String username);

    void saveUser(User user);

    void deleteUser(Long id);
}