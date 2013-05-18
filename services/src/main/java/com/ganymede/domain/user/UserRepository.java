package com.ganymede.domain.user;

/**
 *
 */
public interface UserRepository {

    /**
     *
     * @param id
     * @return
     */
    User findById(Long id);
}
