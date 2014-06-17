package com.alesaudate.sample.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;



@Path("/health")
@Service("healthService")
public class HealthService {
	
	
	

	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHealthStatus() {
		throw new UnsupportedOperationException("This should be executed by Camel");
	}
	
	
}
