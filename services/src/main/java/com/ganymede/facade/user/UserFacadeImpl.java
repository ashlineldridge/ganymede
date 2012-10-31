package com.ganymede.facade.user;

import com.ganymede.domain.user.User;
import com.ganymede.domain.user.UserRepository;
import com.ganymede.facade.transform.SimpleTransformFactory;
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
    private SimpleTransformFactory transformFactory;

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findUserById(id);
        return transformFactory.get(User.class, UserDTO.class).apply(user);
    }
}
