package com.divide2.auth.repository;

import com.divide2.auth.model.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User getByUsername(String username);


}
