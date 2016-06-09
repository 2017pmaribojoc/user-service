package com.captechconsulting.api.user.v1;

import com.captechconsulting.api.user.v1.resource.UserResource;
import com.monarchapis.driver.jaxrs.ConfigConstants;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		packages(ConfigConstants.JERSEY_V2_PROVIDER_PACKAGES);
		register(UserResource.class);
	}
}
