package rest.api.jersey.resource.config.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Path("/path")
//@Produces(value = MediaType.APPLICATION_JSON)
@Consumes
public class PathDefaultController {

    @Context
    private URI uri;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @GET
    public Response pathDefaultJersey() throws JsonProcessingException {
        Map<String, Object> mapToJson = new HashMap();
        mapToJson.put("api","Jersey Rest");
        String json = new ObjectMapper().writeValueAsString(mapToJson);
        return Response.ok(json).build();
    }
}
