package com.giantflyingsaucer.restjson.v1.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface ItemResource {
    // Example: Returning more than one Item
    @GET
	@Produces({MediaType.APPLICATION_JSON}) 
    List<Item> getItems();
}
