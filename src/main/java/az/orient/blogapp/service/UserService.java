package az.orient.blogapp.service;

import az.orient.blogapp.entity.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
