package com.spring_security.Spring_Security_Demo.dao;

import com.spring_security.Spring_Security_Demo.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUsername(String username);
}
