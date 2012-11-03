package com.ganymede.rest.user;

import com.ganymede.facade.user.UserFacade;
import com.ganymede.facade.user.dto.UserDTO;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Controller
@Path("/users")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class UserResource {

    @Inject
    private UserFacade userFacade;

    @GET
    @Path("{id}")
    @AddLinks
    @LinkResource
    public UserDTO getUser(@PathParam("id") Long id) {
        int i = 5;
        System.out.println("" + i);
        return userFacade.getUserById(id);
    }
}
