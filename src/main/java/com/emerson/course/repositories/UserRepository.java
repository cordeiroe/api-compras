package com.emerson.course.repositories;

import com.emerson.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User, Long> {

}
