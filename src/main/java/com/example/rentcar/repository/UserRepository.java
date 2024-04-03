package com.example.rentcar.repository;

import com.example.rentcar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean findFirstByEmail(String email);
}
