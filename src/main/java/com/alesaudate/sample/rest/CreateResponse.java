package com.alesaudate.sample.rest;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;



@Component("createResponse")
public class CreateResponse {
	
	
	public Response make(Exchange exchange) {
		Object entity = exchange.getIn().getBody();
		Integer statusCode = exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class);
		return Response.status(statusCode).entity(entity).build();
	}

}
