package com.example.vaccination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vaccination.Model.User;

public interface myRepository extends JpaRepository<User, Long> {
    
}
