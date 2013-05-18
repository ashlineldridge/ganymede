package com.ganymede.domain.workout;

import com.google.common.collect.Lists;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.List;

/**
 *
 */
@Document
public class Workout {

    @Id
    private Long id;
    private final List<Activity> activities = Lists.newArrayList();
    private Calendar completionDate;

    void addActivity(Activity activity) {
        activities.add(activity);
    }

}
