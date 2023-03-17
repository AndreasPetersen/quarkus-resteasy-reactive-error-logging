package org.acme;

import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import org.jboss.logging.Logger;

public class JaxRsExceptionMapper implements ExceptionMapper<WebApplicationException> {
    @Inject
    Logger logger;

    @Override
    public Response toResponse(WebApplicationException exception) {
        logger.error(exception);
        return exception.getResponse();
    }
}
