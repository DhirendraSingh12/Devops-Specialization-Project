package com.example.usermangdhruv.repository;

import com.example.usermangdhruv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Integer> {
}
