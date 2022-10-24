package com.miith.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miith.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}