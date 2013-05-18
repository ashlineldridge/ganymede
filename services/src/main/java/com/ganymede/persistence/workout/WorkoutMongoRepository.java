package com.ganymede.persistence.workout;

import com.ganymede.domain.workout.Workout;
import com.ganymede.domain.workout.WorkoutRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 */
public interface WorkoutMongoRepository extends WorkoutRepository, MongoRepository<Workout, Long> {
}
