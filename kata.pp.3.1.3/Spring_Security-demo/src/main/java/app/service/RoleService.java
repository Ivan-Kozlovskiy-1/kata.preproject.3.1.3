package app.service;

import app.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Set<Role> findRoles(List<Long> roles);

    List<Role> getAllRoles();
}