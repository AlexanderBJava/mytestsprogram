package ru.alexanderB.Secure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.alexanderB.Secure.domain.Role;
import ru.alexanderB.Secure.domain.User;

import ru.alexanderB.Secure.repositories.UserReposit;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserReposit userReposit;

    @GetMapping("/registration")
    public String registration( ) {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user,Map<String, Object> model ) {
        User userFromDb = userReposit.findByUsername(user.getUsername());

        if(userFromDb != null){
            model.put("message","User exists!");  //if user already exist- send message on registr. page.
            return "registration";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.User));
        userReposit.save(user);
        return "redirect:/login";
    }
}
