package org.acme;

import java.io.IOException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

/**
 * The exception from this filter will be logged in the `JaxRsExceptionMapper`
 */
public class WebApplicationExceptionContainerRequestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        throw new WebApplicationException("WebApplicationException from container request filter");
    }
}
