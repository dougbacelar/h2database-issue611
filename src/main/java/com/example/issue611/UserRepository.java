package com.example.issue611;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by douglascarvalho on 15/10/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public User getOneByUserCodeAndUserType( String userCode, String userType );
}
