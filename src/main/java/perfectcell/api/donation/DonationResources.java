package perfectcell.api.donation;

import perfectcell.model.Donation;
import perfectcell.model.User;
import perfectcell.repositories.DbPersistance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

/**
 * Created by jjgha on 2016-02-13.
 */
@Path("donations")
public class DonationResources {
    private DbPersistance dbPersistance = DbPersistance.getInstance();

    @GET
    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ArrayList<Donation> listDonations() {
        return dbPersistance.donationRepository.List();
    }

    @GET
    @Path("/getdonation/{giver}/{receiver}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ArrayList<Donation> getUser(@PathParam("giver")String giver,@PathParam("receiver")String receiver) {
        ArrayList<Donation> donation = new ArrayList<>();
        donation.add(dbPersistance.donationRepository.GetDonation(giver,receiver));
        return donation;
    }

    @POST
    @Path("/adddonation")
    public Response AddDonation(Donation donation) {
        String output = donation.toString();
        dbPersistance.donationRepository.Add(donation);
        return Response.status(200).entity(output).build();
    }
}
