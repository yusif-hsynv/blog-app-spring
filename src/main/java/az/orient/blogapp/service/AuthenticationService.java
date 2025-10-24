package az.orient.blogapp.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface AuthenticationService {
    UserDetails authenticate(String email, String password);

    String generateToken(UserDetails userDetails);
    UserDetails validateToken(String token);
}
