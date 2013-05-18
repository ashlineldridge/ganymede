package com.ganymede.facade.workout.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement(name = "workout")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConditioningRecordDTO extends RecordDTO {

    private double distanceMetres;
    private double timeSeconds;
    private int rateMinuteAverage;
    private int heartBeatsPerMinuteAverage;
    private int heartBeatsPerMinuteMaximum;
}
