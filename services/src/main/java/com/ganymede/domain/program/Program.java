package com.ganymede.domain.program;

import com.ganymede.domain.workout.Workout;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 *
 */
@Document
public class Program {

    @Id
    private Long id;
    private Set<Workout> workouts;
}
