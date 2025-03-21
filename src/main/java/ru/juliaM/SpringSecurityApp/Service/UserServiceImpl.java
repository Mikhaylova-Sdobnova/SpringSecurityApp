package ru.juliaM.SpringSecurityApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.juliaM.SpringSecurityApp.DAO.UserDao;
import ru.juliaM.SpringSecurityApp.Model.User;
import org.springframework.stereotype.Component;
import ru.juliaM.SpringSecurityApp.Model.Role;

import java.util.List;
import java.util.Set;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleService roleService;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        if (user.getRoles() == null || user.getRoles().isEmpty()) {
            Role defaultRole = roleService.getRoleByName("ROLE_USER");
            if (defaultRole != null) {
                Set<Role> roles = Set.of(defaultRole);
                user.setRoles(roles);
            }
        }
        userDao.saveUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}