///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package org.compulynx.enterprise.core.servicelayer.rest;
//
//import java.util.List;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.Field;
//import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.Item;
//import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.OrgHierarchy;
//import org.compulynx.enterprise.core.businesslogiclayer.models.hierarchy.Structure;
//import org.compulynx.enterprise.core.servicelayer.DummyDataGenerator;
//
///**
// *
// * @author Kimando
// */
//
//@Path("/config")
//public class Configuration
//{
//    @POST
//    @Path("/create")
//    @Consumes("application/json")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response createConfig(OrgHierarchy orgHierarchy)
//    {
//        List<Structure> structures = orgHierarchy.getStructures();
//
//        org.compulynx.enterprise.core.businesslogiclayer.controllers.hierarchy.Configuration configuration = new org.compulynx.enterprise.core.businesslogiclayer.controllers.hierarchy.Configuration();
//
//        return Response.status(200).entity(configuration.createOrganisationHierarchy(orgHierarchy)).build();
//    }
//    
//    @POST
//    @Path("/get")
//    @Consumes("application/json")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getConfig()
//    {
//        /*DummyDataGenerator dummyDataGenerator = new DummyDataGenerator();
//
//        List<Field> fields = dummyDataGenerator.generateFields(1,3);
//        List<Item> items = dummyDataGenerator.generateItems(4, 7, fields);
//        List<Structure> structures = dummyDataGenerator.generateStructures(1, 3, fields, items);
//
//        OrgHierarchy orgHierarchy = new OrgHierarchy();
//        orgHierarchy.setStructures(structures);*/
//
//        org.compulynx.enterprise.core.businesslogiclayer.controllers.hierarchy.Configuration configuration = new org.compulynx.enterprise.core.businesslogiclayer.controllers.hierarchy.Configuration();
//
//        return Response.status(200).entity(configuration.fetchOrganisationHierarchy()).build();
//    }
//}
