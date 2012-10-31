package com.ganymede.facade.user.dto;

import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import org.jboss.resteasy.links.RESTServiceDiscovery;
import org.jboss.resteasy.links.ResourceID;

import javax.xml.bind.annotation.*;

/**
 *
 */
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
@Mapped(namespaceMap = @XmlNsMap(jsonName = "atom", namespace = "http://www.w3.org/2005/Atom"))
public class UserDTO {

    @XmlElementRef
    private RESTServiceDiscovery rest;

    @ResourceID
    @XmlTransient
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
}
