package com.ganymede.rest.program;

import com.ganymede.facade.program.ProgramFacade;
import com.ganymede.facade.program.dto.ProgramDTO;
import com.ganymede.facade.user.dto.UserDTO;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.ReflectionUtils;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Controller
@Path("/programs")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ProgramResource {

    @Inject
    private ProgramFacade programFacade;

    @GET
    @AddLinks
    public Iterable<ProgramDTO> getPrograms() {
        return programFacade.findAll();
    }

    @GET
    @Path("{id}")
    @AddLinks
    @LinkResource
    public ProgramDTO getProgram(@PathParam("id") Long id) {
        return programFacade.findById(id);
    }

    @GET
    @Path("init")
    @AddLinks
    @LinkResource
    public String init(@PathParam("id") Long id) {
        // Perform initialisation here...
        //ReflectionUtils reflectionUtils = new ReflectionUtils();
        return "DONE";
    }
}
