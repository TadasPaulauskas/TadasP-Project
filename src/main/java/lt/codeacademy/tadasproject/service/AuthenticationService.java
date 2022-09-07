package lt.codeacademy.tadasproject.service;

import lt.codeacademy.tadasproject.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
