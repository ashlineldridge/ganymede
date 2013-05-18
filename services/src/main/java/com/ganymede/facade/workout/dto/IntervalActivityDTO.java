package com.ganymede.facade.workout.dto;

import com.google.common.collect.Lists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 */
@XmlRootElement(name = "workout")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntervalActivityDTO extends ActivityDTO {

    private final List<IntervalDTO> intervals = Lists.newArrayList();

    void addInterval(IntervalDTO interval) {
        intervals.add(interval);
    }
}
