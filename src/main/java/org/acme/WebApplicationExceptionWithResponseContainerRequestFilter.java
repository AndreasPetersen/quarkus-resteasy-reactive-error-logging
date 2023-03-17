package org.acme;

import java.io.IOException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;

/**
 * The exception from this filter will _not_ be logged in the `JaxRsExceptionMapper`
 */
public class WebApplicationExceptionWithResponseContainerRequestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        Response response = Response.status(500).entity("Fra container request filter").build();
        throw new WebApplicationException(response);
    }
}
