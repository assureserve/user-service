package com.base.controller;

import com.base.entity.Person;
import com.base.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class UserApiController {

    public static final Logger logger = LoggerFactory.getLogger(UserApiController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    Person sayHello(@RequestParam(value="name", required=false, defaultValue="Test Person") String name) {
        return new Person(1, name);
    }

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public List<Person> listAllUsers() {
        List<Person> users = userService.findAllUsers();
        if (users.isEmpty()) {
            return new ArrayList<>();
        }
        return users;
    }
}
