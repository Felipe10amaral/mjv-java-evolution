package com.mjvgames.appmjvgames.repository;

import com.mjvgames.appmjvgames.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
