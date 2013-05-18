package com.ganymede.facade.program.dto;

import com.ganymede.facade.workout.dto.WorkoutDTO;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import org.jboss.resteasy.links.RESTServiceDiscovery;
import org.jboss.resteasy.links.ResourceID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@XmlRootElement(name = "program")
@XmlAccessorType(XmlAccessType.FIELD)
@Mapped(namespaceMap = @XmlNsMap(jsonName = "atom", namespace = "http://www.w3.org/2005/Atom"))
public class ProgramDTO {

    @XmlElementRef
    private RESTServiceDiscovery links;

    @ResourceID
    @XmlTransient
    private String id;

    @XmlElementWrapper(name = "workouts")
    @XmlElement(name = "workout")
    private Set<WorkoutDTO> workouts = new HashSet<WorkoutDTO>();
}
