package rest.api.jersey.resource.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import rest.api.jersey.resource.config.resources.GZipEncodingJersey;

import javax.ws.rs.ApplicationPath;
import java.util.*;

@Configuration
@ApplicationPath("/api")
public class ApplicationConfigJersey extends ResourceConfig {

    public ApplicationConfigJersey() {
        packages("rest.api.jersey.resource.config.resources");

        Set<Class<?>> classConfig = new HashSet<>();
        classConfig.add(GZipEncodingJersey.class);

        registerClasses(classConfig);
    }
}
