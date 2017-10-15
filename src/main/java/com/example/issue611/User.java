package com.example.issue611;

import javax.persistence.*;

/**
 * Created by douglascarvalho on 15/10/2017.
 */
@Entity
@Table( name = "user" )
@IdClass( UserId.class )
public class User {

        @Id
        @Column( name = "user_code" )
        private String userCode;

        @Id
        @Column( name = "user_type" )
        private String userType;

        @Column( name = "user_name" )
        private String userName;
}
