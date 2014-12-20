package org.compulynx.enterprise.core.servicelayer.rest.dimensionConfig;

import org.compulynx.enterprise.core.businesslogiclayer.controllers.productDimensions.MmDimensionConfigController;
import org.compulynx.enterprise.core.businesslogiclayer.models.productDimensions.DimensionsConfig;

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
@Path("/dimensions")
public class DimensionsConfigManagement {

	@GET
	@Path("/config/get")
	@Consumes("appliction/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllDimensionConfig() {
		MmDimensionConfigController dimensionConfigController = new MmDimensionConfigController();

		return Response.status(200).entity(dimensionConfigController.getDimensionConfig()).build();
	}

	@GET
	@Path("/config/create")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createDimensionConfig(List<DimensionsConfig> mmConfig) {
		MmDimensionConfigController dimensionConfigController = new MmDimensionConfigController();

		return Response.status(200).entity(dimensionConfigController.createDimensionsConfig(mmConfig)).build();
	}

	@GET
	@Path("/config/create")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateDimensionConfig(List<DimensionsConfig> mmConfig) {
		MmDimensionConfigController dimensionConfigController = new MmDimensionConfigController();

		return Response.status(200).entity(dimensionConfigController.updateDimensionsConfig(mmConfig)).build();
	}
}
