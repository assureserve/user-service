package com.base.service;

import com.base.dao.UserRepository;
import com.base.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public Person findById(Long id) {
        return userRepository.findOne(id);
    }

    public Person findByFirstName(String name) {
        return userRepository.findByFirstName(name);
    }

    public void saveUser(Person user) {
        userRepository.save(user);
    }

    public void updateUser(Person user){
        saveUser(user);
    }

    public void deleteUserById(Long id){
        userRepository.delete(id);
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    public List<Person> findAllUsers(){
        return userRepository.findAll();
    }

    public boolean isUserExist(Person user) {
        return findByFirstName(user.getFirstName()) != null;
    }
}
