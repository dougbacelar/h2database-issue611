package com.example.issue611;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by douglascarvalho on 15/10/2017.
 */
@DataJpaTest
@RunWith( SpringRunner.class )
@SqlGroup({
        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
                scripts = "create-user-table.sql"),
        @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD,
                scripts = "drop-user-table.sql")
} )
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testingUserRepository() {
        // next line throws java.lang.ClassCastException
        User user = userRepository.getOneByUserCodeAndUserType("123", "ADMIN" );

        assert user != null;
    }
}