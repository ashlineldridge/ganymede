package com.ganymede.domain.user;

/**
 *
 */
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public User(Long id, String firstName, String lastName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
}
