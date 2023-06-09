package org.quarkusapplication.login.resource;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.quarkusapplication.login.service.UserService;


@Path("/login")
public class LoginResource {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response login(@QueryParam("username") String username, @QueryParam("password") String password) {
        userService.checkUser(username,password);
        return Response.ok("Access granted!").build();
    }
}
