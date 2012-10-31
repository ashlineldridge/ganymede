package com.ganymede.facade.user;

import com.ganymede.facade.user.dto.UserDTO;

/**
 *
 */
public interface UserFacade {

    /**
     *
     * @param id
     * @return
     */
    UserDTO getUserById(Long id);
}
