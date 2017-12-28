package com.readlearncode.dukesbookshop.restserver.rest;

import com.readlearncode.dukesbookshop.restserver.infrastructure.AuthorRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @version 1.0
 */
@Stateless
@Path("/authors")
public class AuthorResource {

    @EJB
    private AuthorRepository authorRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAuthors(){
        return Response.ok(authorRepository.getAll()).build();
    }

}
