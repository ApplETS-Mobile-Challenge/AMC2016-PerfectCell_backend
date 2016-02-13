package perfectcell.api.news;

/**
 * Created by gnut3ll4 on 22/01/16.
 */

import perfectcell.AbstractUser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("users")
public class NewsResources {

    @GET
    @Path("list/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ArrayList<AbstractUser> getUsers(@PathParam("key") String key) {
        AbstractUser user = new AbstractUser();
        user.setName("john doe");
        user.setDescription("potato");
        ArrayList<String> needs = new ArrayList<>();
        needs.add("i need you");
        user.setNeeds(needs);

        ArrayList<AbstractUser> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}
