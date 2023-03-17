package org.acme;

import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@Path("/")
public class ExceptionResource {

    @Path("/unchecked")
    @GET()
    public Response uncheckedException() {
        if (true) {
            throw new RuntimeException("unchecked exception");
        }

        return Response.ok().build();
    }

    @Path("/checked")
    @GET()
    public Response checkedException() throws IOException {
        if (true) {
            throw new IOException("checked exception");
        }

        return Response.ok().build();
    }

    @Path("/webapplicationexception")
    @GET()
    public Response WebApplicationException() {
        if (true) {
            throw new WebApplicationException("webapplicationexcetion");
        }

        return Response.ok().build();
    }
}