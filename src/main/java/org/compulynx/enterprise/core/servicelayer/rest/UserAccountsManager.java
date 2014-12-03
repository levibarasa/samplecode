/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.compulynx.enterprise.core.servicelayer.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kimando
 */

@Path("/uam")
public class UserAccountsManager
{
    @GET
    @Path("/get/{id}")
    @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLicenses(@Context HttpServletRequest request, @PathParam("id") String id)
    {
        Test test = new Test();
        test.setID(id);       
        
        return Response.status(200).entity(test).build();
    }
    
    class Test
    {
        String id = "";
        public Test()
        {            
        }
        
        public void setID(String id)
        {
            this.id = id;
        }
        
        public String getID()
        {
            return id;
        }
    }
}
