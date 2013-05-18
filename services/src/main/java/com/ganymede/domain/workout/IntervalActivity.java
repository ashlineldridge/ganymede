package com.ganymede.domain.workout;

import com.google.common.collect.Lists;

import java.util.List;

/**
 *
 */
public class IntervalActivity extends Activity {

    private final List<Interval> intervals = Lists.newArrayList();

    void addInterval(Interval interval) {
        intervals.add(interval);
    }
}
