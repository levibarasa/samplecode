package org.compulynx.enterprise.core.servicelayer.rest.brands;

import org.compulynx.enterprise.core.businesslogiclayer.controllers.brands.MmBrandsController;
import org.compulynx.enterprise.core.businesslogiclayer.models.brands.Brands;

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
@Path("/brands")
public class BrandsManagement {

	@GET
	@Path("/brands/get")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllBrands() {
		MmBrandsController brandsController = new MmBrandsController();

		return Response.status(200).entity(brandsController.getBrands()).build();
	}

	@GET
	@Path("/brands/create")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createBrands(List<Brands> brand) {
		MmBrandsController brandsController = new MmBrandsController();

		return Response.status(200).entity(brandsController.createBrands(brand)).build();
	}

	@GET
	@Path("/brands/update")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateBrands(List<Brands> brand) {
		MmBrandsController brandsController = new MmBrandsController();

		return Response.status(200).entity(brandsController.updateBrands(brand)).build();
	}
}
