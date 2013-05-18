package com.ganymede.facade.workout;

import com.ganymede.facade.user.dto.UserDTO;
import com.ganymede.facade.workout.dto.WorkoutDTO;

/**
 *
 */
public interface WorkoutFacade {

    /**
     *
     * @param id
     * @return
     */
    WorkoutDTO findById(Long id);
}
