package com.ganymede.facade.workout.dto;

import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import org.jboss.resteasy.links.RESTServiceDiscovery;
import org.jboss.resteasy.links.ResourceID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Calendar;
import java.util.List;

/**
 *
 */
@XmlRootElement(name = "workout")
@XmlAccessorType(XmlAccessType.FIELD)
@Mapped(namespaceMap = @XmlNsMap(jsonName = "atom", namespace = "http://www.w3.org/2005/Atom"))
public class WorkoutDTO {

    @XmlElementRef
    private RESTServiceDiscovery links;

    @ResourceID
    @XmlTransient
    private String id;
    private List<ActivityDTO> activities;
    private Calendar completionDate;
}
