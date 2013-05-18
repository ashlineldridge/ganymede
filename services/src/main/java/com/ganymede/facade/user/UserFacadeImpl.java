package com.ganymede.facade.user;

import com.ganymede.domain.user.User;
import com.ganymede.domain.user.UserRepository;
import com.ganymede.facade.transform.FacadeTransform;
import com.ganymede.facade.user.dto.UserDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 *
 */
@Service
public class UserFacadeImpl implements UserFacade {

    @Inject
    private UserRepository userRepository;

    @Inject
    private FacadeTransform facadeTransform;

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id);
        return facadeTransform.transform(user, UserDTO.class);
    }
}
