package com.emerson.course.resources;

import com.emerson.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Emerson", "emersoncmarques@outlook.com", "51999533887", "123456");
        return ResponseEntity.ok().body(u);
    }
}
