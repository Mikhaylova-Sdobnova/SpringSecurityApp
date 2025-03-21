package ru.juliaM.SpringSecurityApp.DAO;

import org.springframework.stereotype.Repository;
import ru.juliaM.SpringSecurityApp.Model.Role;

import java.util.List;

@Repository
public interface RoleDao {

    List<Role> getAllRoles();

    Role getRoleById(Long id);

    Role getRoleByName(String name);

    void saveRole(Role role);

    void deleteRole(Long id);
}