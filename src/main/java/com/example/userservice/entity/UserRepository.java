// src/main/java/com/example/userservice/repository/UserRepository.java
//package com.example.userservice.repository;

package com.example.userservice.entity;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
