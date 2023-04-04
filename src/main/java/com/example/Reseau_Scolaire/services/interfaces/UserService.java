package com.example.Reseau_Scolaire.services.interfaces;

import com.example.Reseau_Scolaire.models.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User createUser(User user);
    public User getUserById(Long id);
    public User updateUser(Long id,User user);
    public boolean deleteUser(Long id);
}
