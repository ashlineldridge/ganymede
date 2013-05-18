package com.ganymede.domain.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 */
@Document
public class User {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
}
