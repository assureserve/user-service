package com.base.service;

import com.base.entity.Person;

import java.util.List;

public interface UserService {
    Person findById(Long id);

    Person findByFirstName(String name);

    void saveUser(Person user);

    void updateUser(Person user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<Person> findAllUsers();

    boolean isUserExist(Person user);
}
