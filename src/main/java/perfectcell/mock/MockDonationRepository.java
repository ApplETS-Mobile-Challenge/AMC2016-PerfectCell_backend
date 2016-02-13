package perfectcell.mock;

import perfectcell.model.Donation;
import perfectcell.repositories.ICrudRepository;

import java.util.ArrayList;

/**
 * Created by jjgha on 2016-02-13.
 */
public class MockDonationRepository {
    private ArrayList<Donation> donationsList;

    public MockDonationRepository() {
        this.donationsList = new ArrayList<>();
    }

    public Donation Add(Donation model) {
        donationsList.add(model);
        return model;
    }

    public Donation Edit(Donation model) {
        for (int i = 0; i < donationsList.size(); ++i) {
            if (donationsList.get(i).getGiverName().equals(model.getGiverName()) && donationsList.get(i).getReceiverName().equals(model.getReceiverName()) ) {
                donationsList.remove(i);
                donationsList.add(model);
                return model;
            }
        }
        return null;
    }

    public boolean Delete(String giverName, String receiverName) {
        for (int i = 0; i < donationsList.size(); ++i) {
            if (donationsList.get(i).getGiverName().equals(giverName) && donationsList.get(i).getReceiverName().equals(receiverName)) {
                donationsList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Donation GetDonation(String giverName, String receiverName) {
        for (Donation donation : donationsList) {
            if (donation.getGiverName().equals(giverName) && donation.getReceiverName().equals(receiverName)) {
                return donation;
            }
        }
        return null;
    }

    public ArrayList<Donation> List() {
        return donationsList;
    }
}
