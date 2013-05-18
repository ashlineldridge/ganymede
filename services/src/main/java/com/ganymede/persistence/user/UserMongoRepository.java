package com.ganymede.persistence.user;

import com.ganymede.domain.user.User;
import com.ganymede.domain.user.UserRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
public interface UserMongoRepository extends UserRepository, MongoRepository<User, Long> {
}
