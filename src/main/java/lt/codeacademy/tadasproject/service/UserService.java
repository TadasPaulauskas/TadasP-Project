package lt.codeacademy.tadasproject.service;

import java.util.Optional;

import lt.codeacademy.tadasproject.model.Role;
import lt.codeacademy.tadasproject.model.User;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
