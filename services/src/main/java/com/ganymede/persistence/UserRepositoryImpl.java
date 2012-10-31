package com.ganymede.persistence;

import com.ganymede.domain.user.User;
import com.ganymede.domain.user.UserRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    /**
     * {@inheritDoc}
     */
    @Override
    public User findUserById(Long id) {
        return new User(id, "Ashlin", "Eldridge", "ashlin.eldridge@gmail.com");
    }
}
