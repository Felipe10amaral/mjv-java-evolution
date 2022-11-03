package com.mjvgames.appmjvgames.repository;

import com.mjvgames.appmjvgames.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
