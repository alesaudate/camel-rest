package com.alesaudate.sample.rest;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;
import static javax.ws.rs.core.MediaType.TEXT_XML;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.alesaudate.sample.model.Person;



@Path("/person")
@Consumes({APPLICATION_XML, APPLICATION_JSON, TEXT_XML})
@Produces({APPLICATION_XML, APPLICATION_JSON, TEXT_XML})
@Service("personService")
public class PersonService {
	
	
	
	@POST
	public Response createPerson(Person person) {
		
		throw new UnsupportedOperationException("This should be executed by Camel");
	}

}
