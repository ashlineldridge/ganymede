package com.ganymede.rest.workout;

import com.ganymede.facade.workout.WorkoutFacade;
import com.ganymede.facade.workout.dto.WorkoutDTO;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import org.springframework.stereotype.Controller;

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
@Path("/workouts")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class WorkoutResource {

    @Inject
    private WorkoutFacade workoutFacade;

    @GET
    @Path("{id}")
    @AddLinks
    @LinkResource
    public WorkoutDTO getWorkout(@PathParam("id") Long id) {
        return workoutFacade.findById(id);
    }
}
