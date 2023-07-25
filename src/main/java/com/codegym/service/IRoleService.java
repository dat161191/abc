package com.codegym.service;

import com.codegym.model.user.Role;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> roleAdmin();
    Optional<Role> roleCustomer();

    Optional<Role> roleEmployee();
}
