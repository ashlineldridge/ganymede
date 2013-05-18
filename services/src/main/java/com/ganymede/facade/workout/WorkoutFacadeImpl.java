package com.ganymede.facade.workout;

import com.ganymede.domain.workout.Workout;
import com.ganymede.domain.workout.WorkoutRepository;
import com.ganymede.facade.transform.FacadeTransform;
import com.ganymede.facade.workout.dto.WorkoutDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 *
 */
@Service
public class WorkoutFacadeImpl implements WorkoutFacade {

    @Inject
    private WorkoutRepository workoutRepository;

    @Inject
    private FacadeTransform facadeTransform;

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkoutDTO findById(Long id) {
        Workout workout = workoutRepository.findById(id);
        return facadeTransform.transform(workout, WorkoutDTO.class);
    }
}
