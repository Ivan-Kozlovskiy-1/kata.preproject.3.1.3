package app.dao;

import app.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {
    Set<Role> findRoles(List<Long> roles);

    List<Role> getAllRoles();
}