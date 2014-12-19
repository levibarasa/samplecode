package org.compulynx.enterprise.core.servicelayer.rest.instructions;

import org.compulynx.enterprise.core.businesslogiclayer.controllers.instructions.MmInstructionsController;
import org.compulynx.enterprise.core.businesslogiclayer.models.instructions.Instructions;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by alexkimani on 12/19/14.
 */
@Path("/instructions")
public class InstructionsManagement {

	@GET
	@Path("/instructions/create")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllInstructions() {
		MmInstructionsController instructionsController = new MmInstructionsController();

		return Response.status(200).entity(instructionsController.getInstructions()).build();
	}

	@GET
	@Path("/instructions/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/json")
	public Response updateInstructions(List<Instructions> instructionsList) {
		MmInstructionsController instructionsController = new MmInstructionsController();

		return Response.status(200).entity(instructionsController.updateInstructions(instructionsList)).build();
	}

	@GET
	@Path("/instructions/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/json")
	public Response createInstructions(List<Instructions> instructionsList) {
		MmInstructionsController instructionsController = new MmInstructionsController();

		return Response.status(200).entity(instructionsController.createInstructions(instructionsList)).build();
	}
}
