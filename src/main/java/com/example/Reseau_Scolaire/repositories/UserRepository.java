package com.example.Reseau_Scolaire.repositories;

import com.example.Reseau_Scolaire.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User getUserByNumeroTelephone(String numeroTelephone);
}
