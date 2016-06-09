package com.captechconsulting.api.user.v1.resource;

import com.monarchapis.driver.annotation.ApiInject;
import com.monarchapis.driver.annotation.ApiVersion;
import com.monarchapis.driver.annotation.Authorize;
import com.monarchapis.driver.model.Claims;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Component
@Path("/v1")
@ApiVersion("1")
public class UserResource {

	@ApiInject
	private Claims claims;

	@Authorize(client = "public_profile", delegated = "public_profile")
	@Path("/me")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, Object> getUser() {
		Map<String, Object> response = new HashMap<String, Object>();

		response.put("userId", claims.getSubject().or("unknown"));

		return response;
	}
}
