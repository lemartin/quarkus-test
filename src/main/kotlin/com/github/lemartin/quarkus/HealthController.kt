package com.github.lemartin.quarkus

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("health")
@Produces(MediaType.APPLICATION_JSON)
class HealthController {
    @GET
    fun get() = Health("healthy")
}

data class Health(val status: String)