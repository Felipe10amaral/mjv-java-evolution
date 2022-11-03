package com.mjvgames.appmjvgames.services;

import com.mjvgames.appmjvgames.exceptions.Exception;
import com.mjvgames.appmjvgames.model.User;
import com.mjvgames.appmjvgames.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User userById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow( () -> new Exception(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public User update(Integer id, User obj){
        User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj){
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
    }


}
