package com.ganymede.facade.workout.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement(name = "workout")
@XmlAccessorType(XmlAccessType.FIELD)
public class DistanceActivityDTO extends ActivityDTO {

    private double distanceMetres;
    private int prescribedRateMinuteMinimum;
    private int prescribedRateMinuteMaximum;
    private double prescribedTime;


}
