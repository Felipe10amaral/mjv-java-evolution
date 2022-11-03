package com.mjvgames.appmjvgames.services;

import com.mjvgames.appmjvgames.model.Category;
import com.mjvgames.appmjvgames.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    public Category categoryById(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
